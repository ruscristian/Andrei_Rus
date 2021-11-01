package tema.sci.exceptions_logging;

import java.util.*;
import java.util.Map.Entry;

    public class SortMapByValue {


        public static boolean ASC = true;
        public static boolean DESC = false;


        static Map<Student, Integer> sortByComparator(Map<Student, Integer> unsortedMap, final boolean order)
        {

            List<Entry<Student, Integer>> list = new LinkedList<Entry<Student, Integer>>(unsortedMap.entrySet());

            // Sorting the list based on values
            Collections.sort(list, new Comparator<Entry<Student, Integer>>()
            {
                public int compare(Entry<Student, Integer> o1,
                                   Entry<Student, Integer> o2)
                {
                    if (order)
                    {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                    else
                    {
                        return o2.getValue().compareTo(o1.getValue());

                    }
                }
            });

            // Maintaining insertion order with the help of LinkedList
            Map<Student, Integer> sortedMap = new LinkedHashMap<Student, Integer>();
            for (Entry<Student, Integer> entry : list)
            {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            return sortedMap;
        }

        public static void printMap(Map<Student, Integer> map)
        {
            for (Entry<Student, Integer> entry : map.entrySet())
            {
                System.out.println(entry.getKey());

            }
        }
    }


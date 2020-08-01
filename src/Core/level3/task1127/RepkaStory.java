package Core.level3.task1127;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
//        Person first; // нужно было называть "тянут" pull
//        Person second;// и "тянущий" dragging
//        for (int i = items.size() - 1; i > 0; i--) {
//            first = items.get(i - 1);
//            second = items.get(i);
//            second.pull(first);
//        } // думаю этот код написан чтобы было более наглядно для меня и я понимал, какой объект и куда я отправляю
        for (int i = items.size() - 1; i > 0; i--) {
            items.get(i).pull(items.get(i - 1));
        }
    }
}

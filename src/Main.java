public class Main {
    public static void main(String[] args) {

        // Quest 1
        {
            String firstname = "Ivanov";
            String middlename = "Ivan";
            String lastname = "Ivanovich";

            String fullname = firstname + middlename + lastname;
            System.out.println("ФИО сотрудника " + fullname);

            // Quest 2
            var result = fullname.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета - " + result);
        }
        // Quest 3

        var fullname = "Иванов Семён Семёнович";
        var split = fullname.split(" ");
        for (String current : split) {
            if (current.contains("ё")) {
                var text = current.replace("ё", "е");
                System.out.println(text);
            } else {
                System.out.println(current);
            }

        }
    }
}
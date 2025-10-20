package Pr2_1;

public class Author {

        // Вот эти поля - это как координаты и цвет у окружности, но тут для автора
        private String name; // имя
        private String email; // емейл
        private char gender; // пол (м или ж, символ)

        // Конструктор - вызывается, когда создаем нового автора (new Author(...))
        public Author(String name, String email, char gender) {
            // this - ссылка на текущий объект, чтобы не путать параметры и поля
            this.name = name; // поле name = параметр name
            this.email = email; // поле email = параметр email
            this.gender = gender; // поле gender = параметр gender
        }

        // Геттеры - методы, чтобы получить значение приватного поля
        public String getName() {
            return name; // возвращаем значение поля name
        }

        public String getEmail() {
            return email; // возвращаем значение поля email
        }

        // Сеттер для email - чтобы можно было изменить
        public void setEmail(String email) {
            this.email = email; // устанавливаем новое значение email
        }

        public char getGender() {
            return gender; // возвращаем значение поля gender
        }

        // Метод toString - возвращает строку с описанием объекта
        @Override
        public String toString() {
            // Склеиваем строку, чтобы было удобно читать
            return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
        }
    }
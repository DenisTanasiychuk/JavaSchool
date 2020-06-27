package TestDinamicProxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        //Создаём оригинальный обьект
        Man denis = new Man("Денис", 25,"Ростов-на-Дону","Россия");

        //Получаем загрусчик класса у оригинального объекта
        ClassLoader denisClassLoader = denis.getClass().getClassLoader();

        //Получаем все интерфейсы, которые реализует оригинальный объект
        Class[] interfaces = denis.getClass().getInterfaces();

        //Создаём прокси нашего объекта denis
        Person proxyDenis = (Person) Proxy.newProxyInstance(denisClassLoader,interfaces, new PersonInvocationHandler(denis));

        //Вызываем у прокси объекта один из методов нашего оригинально объекта
        proxyDenis.introduce(denis.getName());

    }
}

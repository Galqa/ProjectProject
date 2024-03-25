package com.project.newweb;

/* Онлайн підписка на журнал.
Ціль: створити веб - додаток з допомогою фреймворка Spring Boot.

Spring Boot вже автоматично налаштовує необхідні компоненти і залежності,
 щоб основна робота була направлена на бізнес - логіку.
Підключення з допомогою MySQL - система управління базами даних, використовувалась при створенні  проекту.
*/

/* Основні package і їх призначення:
Config. В даному випадку налаштовує безпеку додатку розміщуючи конфігураційні класи(Security Config). Використані анотації @Configuration, @Bean.
Controllers. Розміщуються класи контролери які обробляють HTTP запити. Контролери відповідають за обробку різних URL - шляхів та взаємодію з користувачем. Анотації: @RestController, @RequestMapping, @GetMapping.
Model: Розміщуються сутності або моделі. Моделі представляють об'єкти які використовуються в додатку(наприклад: товари, замовлення та інше). Анотоції: @Entity, @Table, @Id.
Services: Розташовані сервіси або бізнес - логіка. Сервіси відповідають за виконання роботи пов'язаної з бізнес логікою. Наприклад: обробка замовлень, розрахунок цін. Анотація: @Service.
Repository: Для використання JPA.
---------------------------
Ця структура допомагає розділити різні аспекти додатку.
Зробити його більш організованим та гнучким.
*/


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewwebApplication.class, args);
    }

}

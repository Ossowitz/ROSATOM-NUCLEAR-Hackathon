package ru.rosatom;

public class Main {

    private final static String TEST = "TEST_DATA";

    public static void main(String[] args) {
        /**
         * @info: Используем паттерн фабрику
         * @brief: https://vertex-academy.com/tutorials/ru/pattern-factory-java/
         */
        final var factory = new ObjectFactory();

        /**
         * @brief: Опционально использовать паттерн Строитель
         * @info: https://habr.com/ru/companies/otus/articles/552412/
         */
        var beanRequest = factory.createIQEpguRosatomArchSpguType();
        var fl = new IQEpguRosatomArchSpguFl();
        var ul = new IQEpguRosatomArchSpguUl();

        fl.setFlSurname("Tikhomirov");
        fl.setFlName("Ilya");
        fl.setFlPatronymic("Alexeyevich");
        fl.setFlBirthdate("05-06-2003");
        fl.setFlSeriya(TEST);
        fl.setFlNomer(TEST);
        fl.setFlDateVidachi(TEST);
        fl.setFlKemVidan(TEST);
        fl.setFlFactAddress(TEST);
        fl.setFlPhone(TEST);
        fl.setFlEmail(TEST);
        fl.setMyOption(TEST);

        ul.setUlName(TEST);
        ul.setOGRN(TEST);
        ul.setINN(TEST);
        ul.setKPP(TEST);
        ul.setUlHeadSurname(TEST);
        ul.setUlHeadName(TEST);
        ul.setUlHeadPatronymic(TEST);
        ul.setUlFactAddress(TEST);
        ul.setUlPhone(TEST);
        ul.setUlEmail(TEST);
        ul.setMyOption(TEST);

        beanRequest.setOrderId(TEST);
        beanRequest.setStatementDate(TEST);
        beanRequest.setDepartment(TEST);
        beanRequest.setServiceCode(TEST);
        beanRequest.setTargetCode(TEST);
        beanRequest.setSelectCode(TEST);
        beanRequest.setIQEpguRosatomArchSpguFl(fl);
        beanRequest.setIQEpguRosatomArchSpguUl(ul);
        /**
         *      Классы из /target опционально аннотировать @Data, @Builder, @ToString из проекта Lombok
         *          Или переопределить toString() и реализовать паттерн Builder
         */
//        System.out.println(beanRequest);

        var beanResponse = factory.createOREpguRosatomArchSpguType();

        beanResponse.setStatusComment("Success");
        beanResponse.setResultState("OK");

        /**
         *      Классы из /target опционально аннотировать @Data, @Builder, @ToString из проекта Lombok
         *          Или переопределить toString() и реализовать паттерн Builder
         */
//        System.out.println(beanResponse);
    }
}
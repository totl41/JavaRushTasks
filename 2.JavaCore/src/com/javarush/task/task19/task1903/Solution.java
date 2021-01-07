package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static{
        Solution.countries.put("UA", "Ukraine");
        Solution.countries.put("RU", "Russia");
        Solution.countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Contact, Customer{
        private IncomeData data;

        IncomeDataAdapter(IncomeData data){
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {

            StringBuilder stringBuilder = new StringBuilder();
            while ((stringBuilder.toString() + data.getPhoneNumber()).length() < 10) stringBuilder.append("0");
            String PoneNumber = stringBuilder.toString() + data.getPhoneNumber();

            PoneNumber = "+" + data.getCountryPhoneCode() + "(" + PoneNumber.substring(0, 3) + ")"
                    + PoneNumber.substring(3, 6) + "-" + PoneNumber.substring(6, 8) + "-" + PoneNumber.substring(8, 10);


            return PoneNumber;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}
package com.bizleap.training.assignment.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class MonthMapGenerator {
    private Map<Integer,Object> monthMap=new HashMap<Integer,Object> (  );
    private class Month{
        private String name;
        private int numberOfDays;
        private int year;
        public Month(String name,int numberOfDays,int year){
            this.name=name;
            this.numberOfDays=numberOfDays;
            this.year=year;
        }
        public String toString(){

            return this.name+"/"+this.year;
        }
    }

    private boolean isValid(int year){
        return year>=0;
    }

    private boolean isValid(int fromYear,int toYear){
        return !(fromYear<=0 || toYear<=0 || fromYear>toYear);
     }
     public boolean isLeapYear(int year){
        return year%400==0;
      }

      private List<Month> createMonthsForYear(int fromYear){
        List<Month> monthList=new ArrayList<Month> ( );
        monthList.add ( new Month ("January",31,fromYear));
        if (isLeapYear ( fromYear ))
            monthList.add ( new Month ( "February", 29, fromYear ) );
            else
            monthList.add ( new Month ( "February", 28, fromYear ) );
          monthList.add ( new Month ( "March", 31, fromYear ) );
          monthList.add ( new Month ( "May", 31, fromYear ) );
          monthList.add ( new Month ( "July", 31, fromYear ) );
          monthList.add ( new Month ( "August", 31, fromYear ) );
          monthList.add ( new Month ( "October", 31, fromYear ) );
          monthList.add ( new Month ( "December", 31, fromYear ) );
          monthList.add ( new Month ( "September", 30, fromYear ) );
          monthList.add ( new Month ( "April", 30, fromYear ) );
          monthList.add ( new Month ( "June", 30, fromYear ) );
          monthList.add ( new Month ( "November", 30, fromYear ) );

          return monthList;
        }

        public Map<Integer,Object> createMonthMap(int fromYear,int toYear){
        if (isValid ( fromYear,toYear )){
            for (int year=fromYear;year<=toYear;year++){
                createMonthMap ( year );
            }
        }else{
            monthMap.put ( fromYear,"Range or years are invalid..." );
            monthMap.put ( toYear,"Range or years are invalid..." );
        }
        return monthMap;
      }

        public Map<Integer,Object> createMonthMap(int year){
        if (isValid ( year )){
           for (Month month:createMonthsForYear ( year )){
               addToMap ( month );
           }
        }else monthMap.put ( year,"Year is invalid..." );

        return monthMap;
        }

        private void addToMap(Month month){
        List<Month> monthList=(List<Month>) monthMap.get ( month.numberOfDays );
        if (monthList!=null){
            monthList.add ( month );
        }else{
            monthList=new ArrayList<Month> (  );
            monthList.add ( month );
            monthMap.put ( month.numberOfDays,monthList );
        }
        }

        private List<Month> createMonthsForYearRange(int fromYear,int toYear){
        List<Month> monthlist=new ArrayList<Month>();
        for (int year=fromYear;year<=toYear;year++){
            monthlist.addAll ( createMonthsForYear ( year ));
        }
        return monthlist;
        }

        public Map<Integer,Object> createMonthMapRange(int fromYear,int toYear){
        if (isValid ( fromYear,toYear )){
            for (Month month :createMonthsForYearRange ( fromYear,toYear )){
                  addToMap (month);
            }
        }else{
            monthMap.put ( fromYear,"Range or years are invalid..." );
            monthMap.put ( toYear,"Range or Years are invalid..." );
        }
        return monthMap;
        }

        public void prettyPrint() {
            StringBuilder sb = new StringBuilder ();
            Iterator iterator = monthMap.entrySet ().iterator ();
            while (iterator.hasNext ()) {
                Map.Entry<Integer, Object> entry = (Map.Entry<Integer, Object>) iterator.next ();

                    sb.append ( entry.getKey () );
                    sb.append ( '=' ).append ( '"' );
                    sb.append ( entry.getValue () );
                    sb.append ( '"' + "\n" );
                    System.out.println ( sb );
                }
            }


    public void prettyPrint2(int fromYear,int toYear) {

        Iterator iterator = monthMap.entrySet ().iterator ();
        while (iterator.hasNext ()) {
            Map.Entry<Integer, Object> entry = (Map.Entry<Integer, Object>) iterator.next ();
            System.out.println (entry.getKey ()+"-> [");
            for (int year = fromYear; year <= toYear; year++) {
                for (Month month : (List<Month>) monthMap.get ( entry.getKey () )) {
                    if (month.year == year)
                       System.out.print ("     "+month.name+" "+month.year+" ]");
                }
                System.out.println ();
            }
        }
    }

    public static void main(String[] args) {
        MonthMapGenerator monthMapGenerator=new MonthMapGenerator ();
     // monthMapGenerator.createMonthMap ( 2010,2012 );
//      monthMapGenerator.createMonthMap ( 2012 );
//      monthMapGenerator.prettyPrint2 (2010,2012);
        monthMapGenerator.createMonthMapRange ( 2000,2002 );
        monthMapGenerator.prettyPrint2 (2000,2002);


       }


















}


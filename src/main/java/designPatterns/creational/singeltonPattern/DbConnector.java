package designPatterns.creational.singeltonPattern;

public class DbConnector {
/*
       // Eager Initialization

       private static final DbConnector dbconnector = new DbConnector();

       private DbConnector(){

       }

       DbConnector getInstance(){
            return dbconnector;
       }
*/

/*
        // Lazy Initialization

        private static final dbConnector;

        private DbConnector(){

        }

        public static DbConnector getInstance(){

               if(dbConnector == null)
               {
                    dbConnector = new DbConnector();
               }
               return dbConnector;
        }

 */
 /*

       // Synchronized

        private static final dbConnector;

        private DbConnector(){

        }

        DbConnector public static synchronized getInstance(){ // saves data in l1 cache,, so memory issue

               if(dbConnector == null)
               {
                    dbConnector = new DbConnector();
               }
               return dbConnector;
        }

 */

  /*

       // double locking

        private static volatile final dbConnector;

        private DbConnector(){

        }

        DbConnector public static synchronized getInstance(){

               if(dbConnector == null)
               {
                    synchronized(DbConnector.class){
                          if(dbConnector == null) {
                              dbConnector = new DbConnector();
                          }
                    }
               }
               return dbConnector;
        }

 */

    /*

       // bill pugh solution

        private DbConnector(){

        }

        private static class Holder {
                private static final DbConnector instance = new DbConnector();
        }

        public static DbConnector getInstance(){
               return Holder.instance;
        }

 */

}

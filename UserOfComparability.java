/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");
        
        System.out.println( System.lineSeparator()
                          + "Date comparisons");

        Date d0 = new Date(2018, 2, 5);

        // Date vs. itself
        reportRelationship( "Date vs. itself", d0, d0, "0");

        // Date vs. later date
        reportRelationship( "Date vs. later date"
                          , d0, new Date( 2019, 2, 5), "-1");
        reportRelationship( "Date vs. later date"
                          , d0, new Date( 2018, 11, 5), "-1");
        reportRelationship( "Date vs. later date"
                          , d0, new Date( 2018, 2, 6), "-1");



        // Date vs. earlier date
        reportRelationship( "Date vs. earlier date"
                          , d0, new Date( 2017, 2, 5), "1");
        reportRelationship( "Date vs. earlier date"
                          , d0, new Date( 2018, 1, 5), "1");
        reportRelationship( "Date vs. earlier date"
                          , d0, new Date( 2018, 2, 3), "1");

        System.out.println( "---- end of Date comparisons ----");


        // System.out.println( System.lineSeparator()
        //                   + "Dog comparisons");

        // IncomparableDog dog0 = new IncomparableDog();
        // IncomparableDog dog1 = new IncomparableDog();
        // reportRelationship( "dog vs. dog", dog0, dog1, "");

         // System.out.println( System.lineSeparator()
         //                  + "Point and Date comparisons");
         // reportRelationship( "Point vs. Date", p0, d0, "");
    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Object a
      , Object b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + ((Comparable)a).compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}
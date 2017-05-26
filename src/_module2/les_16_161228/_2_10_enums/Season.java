package _module2.les_16_161228._2_10_enums;

public enum Season {
   // static final Season WINTER = new Season ("WINTER");
  //  static final Season SPRING = new Season ("SPRING");
    //static final Season SUMMER = new Season ("SUMMER");
   // static final Season AUTUMN = new Season ("AUTUMN");



   WINTER,
   SPRING, SUMMER, AUTUMN;

   /*static Season nextSeason(Season season) {    //вызываем Season.nextSeason
        // Season nextSeason(Season season){     //можно вызвать из объекта
        if (season._3_2_4_equals(Season.AUTUMN)) return Season.WINTER;
        //if (season.==(Season.AUTUMN)) return Season.WINTER;
        return Season.values()[season.ordinal() + 1];
    }*/

   public Season nextSeason(){
      if (this.equals(AUTUMN)) return WINTER;
      return this.values()[this.ordinal()+1];
   }
   public Season prevSeason(){
      if (this.equals(WINTER)) return AUTUMN;
      return this.values()[this.ordinal()-1];
   }

   public static void main(String[] args) {
      System.out.println(AUTUMN.nextSeason());
      System.out.println(WINTER.prevSeason());
   }
}

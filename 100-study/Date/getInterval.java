/*
计算两个日期相差的天数
*/
public static int getInterval(String s1, String s2){
  int interval = 0;
  SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd");

  try{
      Date date1 = myDateFormat.parse(s1);
      Date date2 = myDateFormat.parse(s2);

      interval = (int)((date1.getTime() - date2.getTime()) / (24*60*60*1000));

  }catch(Exception e){
      System.out.println("日期格式错误");
  }

  return abs(interval);
}

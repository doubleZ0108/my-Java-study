/*
获取指定日期所在周的周一的日期
*/
public static String getMonday(Date date){
  Calendar c = Calendar.getInstance();
  c.setTime(date);
  c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
  return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
}

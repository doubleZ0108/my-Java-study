/*
日期类 -> 字符串格式时间
 */
public static String Date2Str(Date date){
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String strDate = sdf.format(date);
    return strDate;
}

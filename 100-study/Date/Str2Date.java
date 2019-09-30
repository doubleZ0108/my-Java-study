/*
字符串格式时间 -> 日期类
 */
public static Date Str2Date(String strDate){
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try{
        date = sdf.parse(strDate);
    }catch (Exception e){
        e.printStackTrace();
    }

    return date;
}

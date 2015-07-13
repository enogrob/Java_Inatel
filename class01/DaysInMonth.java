int iYear = 1999;
int iMonth = Calendar.FEBRUARY;
int iDay = 1;

// Create a calendar object and set year and month
Calendar mycal = new GregorianCalendar(iYear, iMonth, iDay);
//
// // Get the number of days in that month
int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH); // 28

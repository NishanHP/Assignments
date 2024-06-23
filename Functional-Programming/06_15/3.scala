def NormalHourCalc(hours: Int): Int = {
  250 * hours;
}

def OtHourCalc(hours: Int): Int = {
  40 * hours;
}

def PaymentCalc(normalHour: Int, OtHour: Int): Int = {
  return NormalHourCalc(normalHour) + OtHourCalc(OtHour);
}

def TaxCalc(income: Int): Float = {
  return income * 0.12f;
}

def salaryCalc(normHour: Int, otHour: Int): Float = {
  return PaymentCalc(normHour, otHour).toFloat - TaxCalc(
    PaymentCalc(normHour, otHour)
  )
}

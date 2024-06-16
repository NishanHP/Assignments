def AreaDisk(r: Int):Double = {
    return r*r*3.14;
}

def ConvertTemp(temp: Double): Double = {
    return temp*1.80 + 32.00;
}

def VolumeOfSphere(r: Int): Double = {
    return 4/3*r*r*r;
}

def InitialCost(copies: Int): Double = {
    return copies*24.95;
}

def FirstCopyCalc(num: Int): Double = {
    return 3*num;  
}

def RestCalc(num: Int): Double = {
    return num*0.75;
}

def DiscountCalc(num: Double): Double = {
    return num*0.4;
}

def TotalCalc(numOfCopies: Int): Double = {
    return (if (numOfCopies > 50) FirstCopyCalc(50) + RestCalc(numOfCopies - 50) else FirstCopyCalc(numOfCopies)) + InitialCost(numOfCopies);
}

def FinalPriceCalc(numOfCopies: Int): Double = {
    return (TotalCalc(numOfCopies) - DiscountCalc(InitialCost(numOfCopies)));
}

def EasyPace(distance: Int): Double = {
    return distance / 8.0;
}

def Tempo(distance: Int): Double = {
    return distance/7.0;
}
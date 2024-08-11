def ChipherWord(word: String, times: Int):String ={
    word.map(x => chipher(x, times)).toString()
}

def chipher(letter: Char, times: Int):Char = {
    var x = letter.toInt
    
    x match{
        case x if(x >= 65 && x < 91) => 
            if((x+times) > 90) then (x-26+times).toChar else (x+times).toChar
        case x if(x >= 96 && x < 123) => 
            if((x+times) > 122) then (x-26+times).toChar else (x+times).toChar
        case _ => '~'
    } 
}

def deChiperWord(word: String, times: Int):String ={
    word.map(x => dechipher(x, times)).toString()
}

def dechipher(letter: Char, times: Int):Char = {
    var x = letter.toInt
    
    x match{
        case x if(x >= 65 && x < 91) => 
            if((x-times) < 65) then (x+26-times).toChar else (x-times).toChar
        case x if(x >= 96 && x < 123) => 
            if((x-times) < 97) then (x+26-times).toChar else (x-times).toChar
        case _ => '~'
    } 
}
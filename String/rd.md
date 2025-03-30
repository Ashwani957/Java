String vs StringBuilder vs StringBuffer

string is immutable if we try to change then the new object will be created and old one will be discard 
string Buider is mutable  if we try to update a new then it will be created 
stringBuffer is mutable  if we try to update a new then it wiill be create and no new space will be allocated 



string is synchornized means multiple thread  cannot acess the string same time 
string builder is also a synchorized means  mulitple thread cannot acess at same time
string  Buffer is not synchorized 


// string is thread safe 
// string builder is also a thread safe 
// string buffer is not a thread safe 


<!-- string buffer class  -->

String buffer are immutable in nature so that we can change the content of it 
we have various method of string buffer like :
1.setcharAt(index, value)--> first we provide the index where we want to insert or value 

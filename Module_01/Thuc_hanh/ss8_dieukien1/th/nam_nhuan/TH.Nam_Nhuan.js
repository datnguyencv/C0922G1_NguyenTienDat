let year=parseInt(prompt('Enter year '));
let isLeapyear=false   ;

let isDivisibleBy4=year % 4 ==0;

if (isDivisibleBy4){
    let isDivisibleBy100 = year % 100 ==0;
    if (isDivisibleBy100) {
        let isDivisibleby400 = year % 400 == 0;
        if (isDivisibleby400) {
            isLeapyear = true;
        }
    }
    else isLeapyear=true;
}
if (isLeapyear){
    alert(year + ' is leap year');
}
else {
    alert(year + ' is Not leap year');
}



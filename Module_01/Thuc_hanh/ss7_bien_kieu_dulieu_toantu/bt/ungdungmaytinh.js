function tinhToan() {
    let number1 = document.getElementById("num1").value;
    let number2 = document.getElementById("num2").value;
    let result = parseFloat(number1) + parseFloat(number2);
    document.getElementById("result").innerHTML ='Kết quả = '+result ;

}
function tinhToan2() {
    let number1 = document.getElementById("num1").value;
    let number2 = document.getElementById("num2").value;
    let result = parseFloat(number1) - parseFloat(number2);
    document.getElementById("result").innerHTML ='Kết quả = '+result;

}
function tinhToan3() {
    let number1 = document.getElementById("num1").value;
    let number2 = document.getElementById("num2").value;
    let result = parseFloat(number1) * parseFloat(number2);
    document.getElementById("result").innerHTML ='Kết quả = '+result;

}
function tinhToan4() {
    let number1 = document.getElementById("num1").value;
    let number2 = document.getElementById("num2").value;
    let result = parseFloat(number1) / parseFloat(number2);
    document.getElementById("result").innerHTML ='Kết quả = '+result;

}

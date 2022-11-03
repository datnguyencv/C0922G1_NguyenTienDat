let x=0;
let array=Array();

function inputNumber() {
    array[x]=document.getElementById("textin").value;
    alert("Element: " +array[x]+ " Add at index " +x );
    x++;
    document.getElementById('textin').value=' ';

}
function outputArray() {
    let e ="<hr/>";
    for (let i=0;i<array.length;i++){
        e +="Element: " +i+ "=" + array[i] + "<br/>";
    }
document.getElementById('result').innerHTML=e;
}

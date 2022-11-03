function changeMoney() {
    let convert = document.getElementById("convert").value;
    let fromC = document.getElementById("from").value;
    let to = document.getElementById("to").value;
    let result;

    if (fromC === "USD" && to === "VND")
        result = "Result: " + convert*23000 + " Đồng";
    else if (fromC === "VND"&& to ==="USD")
        result = "Result: "+ convert/23000 + " $";
    else if (fromC === "VND")
        result = "Result: " + convert + " Đồng";
     else
        result = "Result: " + convert + " $";


    document.getElementById("result").innerHTML = result;
}

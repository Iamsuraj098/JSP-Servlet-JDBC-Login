// var notaccount = document.getElementsByClassName("bottom");
let lookup = document.getElementById("lookup");
let lookup0 = document.getElementById("lookup0");
let lookup2 = document.getElementById("lookup2");
let circle = document.getElementsByClassName("circle");

// notaccount[0].addEventListener("click", function () {
//     lookup.style.opacity = "0";
//     lookup.style.zIndex = "-1";
//     lookup2.style.opacity = "1";
//     lookup2.style.zIndex = "10";
//     lookup2.style.transition = "0.5s";
// })

// notaccount[1].addEventListener("click", function () {
//     lookup.style.opacity = "1";
//     lookup.style.zIndex = "10";
//     lookup.style.transition = "0.5s";
//     lookup2.style.opacity = "0";
//     lookup2.style.zIndex = "-1";
// })

let string1 = "";
let string2 = "";
let string3 = "";

var user = document.getElementById("userId");
var otp = document.getElementById("otp");

// var flag = 0;
var arr = {};
var k = 0;

function check() {
    string1 = user.value;
    var flag = 0;
    if(string1.length != 10){
        alert("Invalid mobile number.");
    }
    else if(string1.length == 10){
        alert("OTP sent.");
        flag = 1;
    }
    else if(string1 == ""){
        alert("Fill all required data.");
        return; 
    }

    if(flag == 1){
        lookup.style.opacity = "0";
        lookup.style.zIndex = "-1";
        lookup0.style.opacity = "1";
        lookup0.style.zIndex = "10";
    }

}

function checkotp(){
    string3 = otp.value;
    var flag = 0;
    if(string3 == ""){
        alert("Enter otp");
        return;
    }
    else{
        flag = 1;
    }

    if(flag == 1){
        lookup0.style.opacity = "0";
        lookup0.style.zIndex = "-1";
        lookup2.style.opacity = "1";
        lookup2.style.zIndex = "10";
        lookup2.style.transition = "0.5s";
    }
}

var string4 = "";
var string5 = "";
var string6 = "";
var string6 = "";
var string7 = "";

var newuser = document.getElementById("newuser");
var newEmail = document.getElementById("newEmail");
var Address = document.getElementById("Address");
var newpassword = document.getElementById("newpassword");

function register(){
    string4 = otp.value;
    string5 = newEmail.value;
    string6 = Address.value;
    string7 = newpassword.value;
    var flag = 0;
    if(string4 == "" ||string5 == "" || string6 == "" || string7 == ""){
        alert("Fill all data");
        return;
    }
    else{
        flag = 1;
    }

    if(flag == 1){
        lookup0.style.opacity = "0";
        lookup0.style.zIndex = "-1";
        lookup2.style.opacity = "1";
        lookup2.style.zIndex = "10";
        lookup2.style.transition = "0.5s";
    }
}

var save = new File("save.txt");
save.open
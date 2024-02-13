function rollDice() {
    var result = Math.floor(Math.random() * 6) + 1;
    document.getElementById("diceResult").value = result;
}

document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("diceResult").focus();
});
console.log("hello world");
let display=document.getElementById("display");
let btns = document.getElementsByClassName('button'); // it is a HTML Collection not an array
console.log(btns)
let btnsArray = Array.from(btns); // HTMLCollection -> Array
console.log(btnsArray);
btnsArray.forEach((btn)=>{
    
    btn.addEventListener('click',(e)=>{
        console.log(e);
        console.log(e.target);
        console.log(e.target.innerText);
        switch(e.target.innerText){
            case 'C':
                   display.innerText = " ";
                   break;
            case '←' : 
                  display.innerText = display.innerText.substring(0,display.innerText.length-1)
                   break;
             case '=' :
                    try{
                        display.innerText = eval(display.innerText);
                        if(display.innerText==Infinity) {
                            display.innerText = "";
                            window.alert("cannot divide by zero");
                        }
                    }
                    catch(err){
                        display.innerText = "";
                        window.alert("invalid code");
                    }
                   break;
            default :
               display.innerText += e.target.innerText;
        }
    })
    
})


btnsArray.forEach((btn)=>{

    btn.addEventListener("mouseover", (event) => {
        let hoveredElement = event.target;
        hoveredElement.style.background  = 'black' 
        hoveredElement.style.color = 'white' 
        console.log(event.target)
   });
   btn.addEventListener("mouseout", (event) => {
    let hoveredElement = event.target;
    hoveredElement.style.background="rosybrown";
    hoveredElement.style.color="black";
});
   
})

//background-color: rosybrown;



//eejhsih.substring(0,len-1)

























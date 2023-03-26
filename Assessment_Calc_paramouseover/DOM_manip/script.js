let para = document.querySelector('#para-id');
let btn = document.querySelector('#btn')
let inp = document.querySelector('#inp');
let lis = document.querySelectorAll('.li');
let lia = Array.from(lis);
para.addEventListener('mouseover',(e)=>{
     console.log(e.target.style)
     para.style.color='red'
     para.style.cursor='pointer'
})
para.addEventListener('mouseout',(e)=>{
    console.log(e.target.style)
    para.style.color='black'
})
btn.addEventListener('mouseover',()=>{
    btn.innerHTML='you hovered on btn'
})
btn.addEventListener('mouseout',()=>{
    btn.innerHTML='the Button text'
})
btn.addEventListener('click',()=>{
    para.innerText = inp.value;
})
lia.forEach((li)=>{
    li.addEventListener('mouseover',()=>{
         li.style.color = "green";
         li.style.fontSize='34px';
    })
})
lia.forEach((li)=>{
    li.addEventListener('mouseout',()=>{
         li.style.color = "black";
         li.style.fontSize= 'medium';
    })
})
function solution(s){
    let arrString = [...s]
    const stack = [];
    
    arrString.map((letter,index) => {
        if(stack[stack.length-1] === "(" && letter === ")"){
            stack.pop()
        }else{
            stack.push(letter)
        }
    })
    
    return stack.length ===0 ? true : false
}

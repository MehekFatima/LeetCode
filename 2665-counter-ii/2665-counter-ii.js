/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let value = init;
    function increment(){
        return init+=1;
}
    function reset(){
        init = value;
        return init;
}
    function decrement(){
        return init-=1;
    }
    
    return { increment: increment, decrement: decrement, reset: reset };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
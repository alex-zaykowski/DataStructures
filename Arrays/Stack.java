/**
 * 3ms faster than 100% of java submissions which is good enough for me
 * the space could be a little bit better (only better than 65%) but I'm assuming
 * that's because of how much extra space I add to the array each time.
 * 
 * After I completed this I looked at other people's solutions saw online someone 
 * used a node class, this is done with pure arrays and no extra classes so with that 
 * being said I'm pretty satisfied with this solution. I might reattempt but to be honest
 * running in only 3ms is nearly impossible to beat.
 */
class MinStack {
    private int[] _stack;
    private int _top;
    private int _min;
    public MinStack() {
        _stack = new int[10];
        _top = -1;
        _min = 0;
    }
    
    public void push(int val) {
        _top++;
        if(_top == _stack.length){
            addSpace();
            _stack[_top] = val;
        }else{
            _stack[_top] = val;
        }
        if(val < _stack[_min]){
            _min = _top;
        }
        
    }
    
    public void pop() {
        _top--;
        if(_min > _top){
            _min = 0;
            for(int i = 0; i <= _top; i++){
                if(_stack[_min] > _stack[i]){
                    _min = i;
                }
            }
        }
    }
    
    public int top() {
        return _stack[_top];
    }
    
    public int getMin() {
        return _stack[_min];
    }
    
    private void addSpace(){
        int[] stackCopy = _stack.clone();
        _stack = new int[_stack.length * 2];
        for(int i = 0; i < stackCopy.length; i++){
            _stack[i] = stackCopy[i];
        }
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
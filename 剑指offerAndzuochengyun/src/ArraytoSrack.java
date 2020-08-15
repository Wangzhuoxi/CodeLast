public class ArraytoSrack {
    /**
     * 数组结构实现大小固定的队列和栈
     * index指针永远指向下一个要输入的位置。
     */
    public static class ArrayStack{
       private Integer[] arr;
        private int index;
        public ArrayStack(int initsize)
        {
            if(initsize<=0)
                throw new IllegalArgumentException("size less than 0");
            arr=new Integer[initsize];
            index=0;
        }
        public Integer peek()
        {
            if(index==0)
                return null;
            return arr[index-1];
        }
        public void push(Integer num)
        {
            if(index>=arr.length)
                throw new ArrayIndexOutOfBoundsException("out of bound");
           arr[index++]=num;
        }
        public Integer pop()
        {
            if(index==0)
                return null;
            return arr[--index];
        }

    public static class ArrayQueue
        {
            private int size;
            private Integer[] arr;
            private int start=0;
            private int end=0;
            private ArrayQueue(int ini_size)
            {
                if(ini_size<=0)
                    throw new IllegalArgumentException("size<=0");
                arr= new Integer[ini_size];
            }
            private Integer peek()
            {
                if(size==0)
                return null;
                return arr[start];
            }
            private Integer poll()
            {
                if(size==0)
                    return null;
                return arr[start++];
            }
            private void push(Integer num)
            {
                if(size>=arr.length)
                    throw new IndexOutOfBoundsException("queue is full");
                size++;
                arr[end]=num;
                end=end+1==arr.length?0:end++;

            }

        }

    }

}

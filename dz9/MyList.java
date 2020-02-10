package ru.mike.dz9;

public class MyList<T>{
    private int pointeToEnd; //укзатель на последний заполненный элемент
    private Object[] array;
    public MyList(){
        array = new Object[10];
        pointeToEnd = 0;
    }
    public MyList(int capasity){
        array = new Object[capasity];
        pointeToEnd = 0;
    }

    public void add(T item){
        if(array.length == pointeToEnd){
            //увеличиваем размер массива в 2 раза
            Object[] tmp = new Object[array.length * 2];
            System.arraycopy(array, 0 , tmp, 0, array.length - 1);
            array = tmp;
            array[pointeToEnd++] = item;
        }else {
            array[pointeToEnd++] = item;
        }
    }

    public T get(int index){
        T result = null;
        if(index < pointeToEnd){
            result = (T) array[index];
        }
        return result;
    }

    public T remove(int index){
        T result = null;
        if(index < pointeToEnd){
            result = (T) array[index];
            Object[] tmp = new Object[array.length - 1];
            System.arraycopy(array, 0, tmp, 0, index);
            if(pointeToEnd < array.length){
                System.arraycopy(array, index + 1, tmp, index, array.length - index - 1);
            }
            array = tmp;
        }
        return result;
    }

    public int size(){
        return pointeToEnd;
    }
}

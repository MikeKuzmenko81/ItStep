package ru.mike.dz9;

public class MyDict<TKey,TValue> {
    private int pointeToEnd; //укзатель на последний заполненный элемент
    private Object[] arKey;
    private Object[] arVal;

    public MyDict(){
        arKey = new Object[10];
        arVal = new Object[10];
        pointeToEnd = 0;
    }
    public MyDict(int capasity){
        arKey = new Object[capasity];
        arVal = new Object[capasity];
        pointeToEnd = 0;
    }

    //добавление
    public void add(TKey keyItem, TValue valItem){
        //проверка что такого ключа еще нет в arKey
        boolean isKey = false;
        int index = 0;
        for(int i = 0; i < arKey.length; i++){
            if (arKey[i].equals(keyItem)){
                isKey = true; //нашли в текущем словаре такой же ключ
                index = i; //запомнили его позицию для доступа arVal
            }
        }

        //записываем значение по переданому ключу
        if(isKey){
            arVal[index] = valItem;
        }
        //увеличиваем размер массива в 2 раза если закончился
        else if(arKey.length == pointeToEnd){
            Object[] tmpKey = new Object[arKey.length * 2];
            Object[] tmpVal = new Object[arVal.length * 2];
            System.arraycopy(arKey, 0 , tmpKey, 0, arKey.length - 1);
            System.arraycopy(arVal, 0 , tmpVal, 0, arVal.length - 1);
            arKey = tmpKey;
            arVal = tmpVal;
            arKey[pointeToEnd++] = keyItem;
            arVal[pointeToEnd++] = valItem;
        }else {
            arKey[pointeToEnd++] = keyItem;
            arVal[pointeToEnd++] = valItem;
        }
    }
    //инднксатор
    //получение значение по индексу

    //получить количество пар
    public int size(){
        return pointeToEnd;
    }
}

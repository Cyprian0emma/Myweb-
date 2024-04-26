package com.texteditor;


class UndoableTextArea extends TextArea implements StateEditable
{
    private final static String KEY_STATE = "UndoableTextAreaKey";
    private boolean textChanged = false;
    private UndoManager undoManager;
    private  StateEdit currentEdit;
    public UndoableTextArea(){
        super();
        initUndoable();
    }
    public UndoableTextArea (String string)
    {
        super(string);
        initUndoable();
    }
    public UndoableTextArea (int rows, int columns)
    {
        super(rows , columns);
        initUndoable();
    }
    public UndoableTextArea (String  string, int rows, int columns)
    {
        super(string, rows , columns);
        initUndoable();
    }
    public boolean undo()
    try{
        undoManager.undo();
        return true;
    }
    catch(cannotUndoException e)
    {
        System.out.println("cannot undo");
        return false;
    }



}

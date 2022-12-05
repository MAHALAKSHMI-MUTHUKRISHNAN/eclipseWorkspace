assume cs:code,ds:data
data segment 
num db 1Ah
res db 10 dup('$')
data ends
code segment 
start:mov ax,data
      mov ds,ax
      mov ax,num
      mov si,offset res
      call hex2dec
      lea dx,res
      mov ah,09h
      int 21h
      mov ah,4ch
      int 21h
      hex2dec proc near
       mov cx,0
       mov bx,10
     loop1:mov dx,0
           div bx
           add dl,30h
           push dx
           inc cx
           cmp ax,9
           jp loop1
           add al,30h
           mov [si],al
     loop2:pop ax
           inc si
           mov [si],al
           loop loop2
           ret
      hex2dec endp
      code ends
      end start


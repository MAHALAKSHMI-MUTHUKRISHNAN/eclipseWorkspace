data segment 
a db 50h
b db 25h
c dw ?
data ends
code segment
assume cs:code, ds:data
start:
mov ax,data
mov ds,ax
mov ax,000h
mov bx,000h
mov al,a
mov bl,b
div b
mov c,ax
int 3
code ends
end start
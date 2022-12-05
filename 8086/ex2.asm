assume cs:code, ds:data
data segment
count equ 20
testmsg db "I'm fearfully and wonderfully made by MAHA$"
newmsg db 18 dup(?)
data ends
code segment
start:
mov ax,data
mov ds,ax
mov es,ax
LEA SI,testmsg
LEA DI,newmsg
mov cx,count
cld
rep movsb
mov dx,offset newmsg
mov ah,09h
int 21h
mov ah,4ch
int 21h
code ends
end start
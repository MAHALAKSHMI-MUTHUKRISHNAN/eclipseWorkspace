ASSUME CS:CODE
CODE SEGMENT
START:
MOV SI,1200H
MOV AX,[SI]
MOV SI,1202H
MOV BX,[SI]
AND AX,BX
MOV DI,1300H
MOV [DI],AX
MOV AH,4CH
INT 21H
CODE ENDS
END START

ASSUME CS:CODE 
CODE SEGMENT
START:
MOV SI,1200h
MOV DI,1300H
MOV AL,[SI]
MOV BL,[SI+1]
SUB AL,BL
DAS
MOV [DI],AL
MOV AH,4CH
INT 21H
CODE ENDS
END START
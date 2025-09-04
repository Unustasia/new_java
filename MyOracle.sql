BEGIN
 DBMS_OUTPUT.PUT_LINE('🎉 Привет, Oracle Сегодня: ' || TO_CHAR(SYSDATE, 'DD.MM.YYYY HH24:MI'));
 
 FOR i IN 1..3 LOOP
 DBMS_OUTPUT.PUT_LINE(' → Итерация: ' || i);
 END LOOP;
 
 DBMS_OUTPUT.PUT_LINE('✅ Готово!');
END;

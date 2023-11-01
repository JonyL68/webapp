(function () {
    let ter = $('#unit');
    ter.prop('selectedIndex', 0);
    $.getJSON('./getTerritory', function (data) {
        $.each(data, function (key, entry) {
            ter.append($('<option></option>').attr('value', entry.id).text(entry.nameForSite));
        });
    });

    $('#account').mask('Z#', {
        translation: {
            'Z': {
                pattern: /[0-9]/, optional: true
            }
        },
    });

    var unit = $('#unit').children("option:selected").val();

    $("#account").on('input', function () {
        $("#account_error").hide();
        $("#account").removeClass("important").addClass("important1");

        var account = $("#account").val();

        // Проверяем, достигнута ли длина введенных символов 8
        if (account.length >= 8) {
            // Выполняйте запрос к серверу, чтобы получить адрес по номеру счета
            var address = getAddressByAccountNumber(account);

            // Заполняйте вторую label (id="pay") адресом
            $("#pay").html('<small class="text-muted">(' + address + ')</small>');
        }
    });

    $('#unit').change(function () {
        $("#unit_error").hide();
        $("#unit").removeClass("important1").addClass("important");
    });

    $('#dd').click(function () {
        // ... (остальной код обработки формы)

        // Ваш текущий код обработки кнопки "Відправити"
        // ...

        // Здесь необходимо вставить код для обработки ввода восьмой цифры номера счета
        // Пожалуйста, используйте предложенный в предыдущем ответе код
        // ...

    });

    function getAddressByAccountNumber(accountNumber) {
        // Ваш код запроса на сервере для получения адреса по номеру счета
        // Вместо этого заглушка - вставьте ваш реальный код запроса
        return "123 Main St, City";
    }

})();

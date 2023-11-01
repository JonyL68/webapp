(function () {
    let ter = $('#unit');
    ter.prop('selectedIndex', 0);
    $.getJSON('./getTerritory', function (data) {
        $.each(data, function (key, entry) {
            ter.append($('<option></option>').attr('value', entry.id).text(entry.nameForSite));
        })
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
    })
    $('#unit').change(function () {
        $("#unit_error").hide();
        $("#unit").removeClass("important").addClass("important1");
    })

    $('#dd').click(function () {
            $("#alert_ind_s1").hide();
            $("#alert_ind").hide();
            $("#alert_ind_s").hide();

            var not_send = false;

            var unit = $('#unit').children("option:selected").val();
            if (unit === '') {
                not_send = true;
                $("#unit").removeClass("important1").addClass("important");
                $("#unit_error").show();
            }
            var account = $("#account").val();
            if (account === "") {
                not_send = true;
                $("#account_error").show();
                $("#account").removeClass("important1").addClass("important");
            }

        var unit = $('#unit').children("option:selected").val();
        var account = $("#account").val();

        let url = './getAccount/'+unit+'/'+account;

                if (typeof grecaptcha !== 'undefined' && not_send === false) {

                    $("#captchaError").empty();
                    var resp = grecaptcha.getResponse();
                    if (resp.length === 0) {
                        $("#captchaError").append("<strong>Увага!&nbsp</strong>Підтвердіть дію").show();

                    } else {
                        $.post(
                        $.getJSON(url, function (data) {
                            document.getElementById('new_account').innerHTML = data['newAccount'];
                                                        })
                        .fail(function() {
                            document.getElementById('new_account').innerHTML = 'Обран невірний район чи невірно введений особовий рахунок'; }),
                            function (data) {
                                if (data.message === "pay_fail") {
                                    grecaptcha.reset();
                                    $("#alert_ind").show();
                                } else if (data.message === "captcha_fail") {
                                    grecaptcha.reset();
                                    alert("captcha_fail")
                                } else if (data.message === "pay_double") {
                                    grecaptcha.reset();
                                    $("#alert_ind_s").show();
                                } else if (data.message === "pay_double_e") {
                                    grecaptcha.reset();
                                    $("#alert_ind_s1").show();
                                } else if (data.message === "success") {
                                    $("#success").show();
                                    $("#data").hide();
                                } else {

                                }
                            })
                    }
                }
    });

})()
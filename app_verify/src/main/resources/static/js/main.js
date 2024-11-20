let imgCccd = "";
let imgChuthe = "";
let anhTrongCccd = "";
let anhChup = "";
$(document).ready(function(){
    const socket = io('https://192.168.5.1:8000',{transports:['websocket'], upgrade: false});
    socket.on('connect', () => {
        console.log('Socket connected');
    });
    socket.on('/event', (dgs) => {
        console.log(dgs)
        if (dgs.id == 4) {
            const img = document.getElementById('image-cccd');
            img.src = `data:image/jpeg;base64,${dgs.data.img_data}`;
            imgChuthe = `data:image/jpeg;base64,${dgs.data.img_data}`;
            anhTrongCccd = dgs.data.img_data;
        } else if (dgs.id == 2) {
            console.log(dgs.data);
            $("#full_name").val(dgs.data.personName);
            $("#cccd_number").val(dgs.data.idCode);
            $("#cmnd_number").val(dgs.data.oldIdCode);
            $("#brith_day").val(dgs.data.dateOfBirth);
            $("#issue_date").val(dgs.data.issueDate);
            $("#gender").val(dgs.data.gender);
            $("#expiry_date").val(dgs.data.expiryDate);
            $("#religion").val(dgs.data.religion);
            $("#race").val(dgs.data.race);
            $("#father_name").val(dgs.data.fatherName);
            $("#mother_name").val(dgs.data.motherName);
            $("#wife_name").val(dgs.data.wifeName);
            $("#personal_identification").val(dgs.data.personalIdentification);
            $("#residence_place").val(dgs.data.residencePlace);
            $("#origin_place").val(dgs.data.originPlace);
        } else if (dgs.id == 5) {
            // const dscert = document.getElementById('dscert');
            // dscert.innerHTML = `<p>Document Signer Certificate:</p> ${dgs.data.PA.cert}`;
        }
    });
    socket.on('/info', (data) => {
        $("#info").html(data.serial_device);
    });
})

$(document).ready(function (){
    function updateClock() {
        const now = new Date();
        const hours = String(now.getHours()).padStart(2, '0');
        const minutes = String(now.getMinutes()).padStart(2, '0');
        const seconds = String(now.getSeconds()).padStart(2, '0');
        document.getElementById('clock').textContent = `${hours}:${minutes}:${seconds}`;
    }

    setInterval(updateClock, 1000);
    updateClock(); // Cáº­p nháº­t ngay khi trang vá»«a táº£i
    const today = new Date();

    const day = String(today.getDate()).padStart(2, '0'); // Láº¥y ngÃ y, Ä‘áº£m báº£o cÃ³ 2 chá»¯ sá»‘
    const month = String(today.getMonth() + 1).padStart(2, '0'); // Láº¥y thÃ¡ng, cáº§n cá»™ng thÃªm 1 vÃ¬ thÃ¡ng báº¯t Ä‘áº§u tá»« 0
    const year = today.getFullYear(); // Láº¥y nÄƒm

    const currentDate = `${day}/${month}/${year}`;
    document.getElementById('dateTime').textContent = `${currentDate}`;
    const daysOfWeek = ["Chủ nhật", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7"];

    const currentDay = daysOfWeek[today.getDay()]; // Láº¥y thá»© hiá»‡n táº¡i
    const socket = io.connect('https://192.168.5.1:9000');
    document.getElementById('dateThu').textContent = `${currentDay}`;
    $("#avatar").click(function (){
        $(".box-camera").addClass("active");


        socket.on('/image', (image) => {
            const img = document.getElementById('image');
            imgCccd = `data:image/jpeg;base64,${image.data}`;
            anhChup = image.data;
            img.src = `data:image/jpeg;base64,${image.data}`;
        });
    });
    $(".btn-chup").click(function (){
        const img = document.getElementById('avatar');
        img.src = imgCccd;

    })
    $(".btn-outCamera").click(function (){
        $(".box-camera").removeClass("active");
        socket.off();
    });

    $(".btn-face-matching").click(function (){
        let username = "67c7608f571c4cf391973cbddced8d6d";
        let password = "7b186d73495d9a40567db44fed85deff47bd5213722de09407d549832fd41006";
        let bodyData = JSON.stringify({
            img1 : anhTrongCccd,
            img2 : anhChup,
        });
        console.log(bodyData);
        const auth = btoa(`${username}:${password}`);
       fetch(`https://ekyc-gtelapi.trustid.vn/api/v3/ekyc/face_matching?format_type=base64`, {
           method: 'POST',
           headers:{
               "Authorization": `Basic ${auth}`,
               'Content-Type': 'application/json'
           },
           body: bodyData
       }).then(response => {
           if (!response.ok) {
               if (response.status === 500) {
                   console.log(response.statusText);
               }
               throw new Error('Network response was not ok');
           }
           return response.json();
       }).then(data => {
           console.log(data)
       }).catch(error => {
           console.error('There has been a problem with your fetch operation:', error);
       });
    });

});
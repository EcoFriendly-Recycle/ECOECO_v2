window.onload = function() {

    // 공지사항 작성 스크립트
    if (document.getElementById("noticeWrite")) {
        const $noticeWrite = document.getElementById("noticeWrite");
        $noticeWrite.onclick = function () {
            location.href = "/manager/board/write";
        }
    }

    if (document.getElementById('noticeCategory')) {
        document.getElementById('noticeCategory').addEventListener('change', function() {
            var category = this.value;
            var subCategorySelect = document.getElementById('noticeSubCategory');

            // FAQ 카테고리가 선택된 경우에만 서브 카테고리를 활성화
            if (category === 'FAQ') {
                subCategorySelect.disabled = false;
            } else {
                // FAQ 이외의 카테고리가 선택된 경우 서브 카테고리를 비활성화
                subCategorySelect.disabled = true;
                // 선택된 서브 카테고리를 '선택'으로 리셋
                // subCategorySelect.value = '';
            }
        });
    }

    if(document.getElementById("writeBoard")) {
        const $writeBoard = document.getElementById("writeBoard");
        $writeBoard.onclick = function() {
            location.href = "/manager/board/write";
        }
    }
}

<!-- 공지사항 작성 페이지 카테고리가 null값일 경우 발생하는 오류 페이지 대신 모달창 띄움 -->
function validateForm() {
    var category = document.getElementById("noticeCategory").value;
    if (!category || category === "선택") { // category 값이 없거나 "선택"과 동일한 경우
        alert("분류를 선택해주세요.");
        return false;
    }
    return true;
}

function deleteNotice(noticeNo) {
    fetch('/manager/board/deleteNotice', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json; charset=UTF-8'
        },
        body: JSON.stringify({ noticeNo })
    })
        .then(response => {
            if (!response.ok) {	//  fetch API의 Response 객체에서 응답 상태 코드가 성공적인지 확인하는 구문
                throw new Error('네트워크 응답 없음');
            }
            // 삭제가 성공하면 사용자에게 메시지를 표시하고 noticeList 페이지로 redirect
            alert('게시글이 삭제되었습니다.');
            window.location.href = '/manager/board/noticeList'; // noticeList 페이지로 이동
        })
        .catch(error => console.error('Error:', error));
}
// th:if="${ reply.writer.memberNo == #authentication.principal.memberNo }
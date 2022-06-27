$.get("http://localhost:3000/api", function (data1, status) {
    df = Object.values(data1)
    $.get("http://localhost:3000/api/bus", function (data, status) {
        kl = df.sort(function (a, b) { return b - a })
        for (let index = 0; index < data.count; index++) {

            arr = getKeyByValue(data1, kl[index]).split("=>")

            card(arr[2] + ' via ' + arr[3], kl[index] + '/45', combine(arr))
        }
    });
});
function card(way, count, a) {
    const courses_container = document.querySelector(".courses-container");
    console.log(courses_container);

    const course = document.createElement('div');
    course.classList = 'course';
    const card = `
    <div class="course-preview">
    <h6>Super Deluxe</h6>
    <h2>Perumbavoor to kattapana</h2>
    <a href="#">Rs.150 <i class="fas fa-chevron-right"></i></a>
    </div>
    <div class="course-info">
    <div class="progress-container">
    <div class="progress"></div>
    <span class="progress-text">
    <label id="num">${count}<label>
    </span>
    </div>
    <h6>12:00pm - 3:30pm</h6>
    <h2 id="kajas">${way}</h2>
    <button onclick='details("${a}")' class="btn">Details</button>
    </div>
    `;
    course.innerHTML += card;
    courses_container.appendChild(course)
}

function getKeyByValue(object, value) {
    return Object.keys(object).find(key => object[key] === value);
}
function details(k) {
    alert(k)

}
function combine(array) {
    var str = ''
    array.map(item => {
        str = str + '->' + item
    })
    return str;
}
/*<![CDATA[*/
var ctx = document.getElementById("ChartDemo").getContext('2d');
var ChartDemo = new Chart(ctx, {
  type: 'line',
  data: {
    // コントローラーで格納したlabelを変数式で取り出すだけ。
    labels: /*[[ ${label} ]]*/,
    datasets: [
      {
        label: "Chart-1",
        borderColor: 'rgb(255, 0, 0)',
        lineTension: 0,
        fill: false,
        // 上記と同様、pointを変数式で取り出しているだけです。
        data: /*[[ ${point} ]]*/,
      },
    ]
  },
  options: {
    responsive: true,
  }
});
  /*]]>*/
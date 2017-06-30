webpackJsonp([44],{1325:function(e,exports,t){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var a={save:function(e,t,a,l){var n=document.createElement("a"),s=l?";charset="+l:"",r=l?""+a+s:a;if(void 0!==n.download)return n.download=t,n.href="data:"+r+","+encodeURIComponent(e),document.body.appendChild(n),n.click(),void document.body.removeChild(n);if(window.navigator&&"function"==typeof window.navigator.msSaveOrOpenBlob){var o=new Blob([e],{type:r});return void window.navigator.msSaveOrOpenBlob(o,t)}try{location.href="data:application/attachment"+s+","+encodeURIComponent(e)}catch(t){location.href="data:text/plain"+s+","+encodeURIComponent(e)}}};exports.default=a,e.exports=exports.default},1346:function(e,exports,t){"use strict";function a(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var l=t(2),n=a(l),s=t(1),r=a(s),o=t(15),c=t(1325),u=a(c),m=t(5),i=a(m),d=t(18),f=a(d),p=t(7),h=a(p),b=t(48),E=f.default.getStore("Dashboards"),k=f.default.getStore("GrokPatterns"),g=f.default.getStore("Inputs"),y=f.default.getStore("Outputs"),N=f.default.getStore("Streams"),v=(f.default.getStore("ConfigurationBundles"),h.default.getActions("Inputs")),x=h.default.getActions("ConfigurationBundles"),C=n.default.createClass({displayName:"ExportContentPackPage",mixins:[r.default.connect(g)],getInitialState:function(){return{}},componentDidMount:function(){var e=this;E.listDashboards().then(function(t){e.setState({dashboards:t})}),k.loadPatterns(function(t){e.setState({grok_patterns:t})}),v.list(),y.load(function(t){e.setState({outputs:t.outputs})}),N.listStreams().then(function(t){e.setState({streams:t})})},onSubmit:function(e){var t=this;e.preventDefault();var a={streams:[],inputs:[],outputs:[],dashboards:[],grok_patterns:[]};Object.keys(this.refs).forEach(function(e){if(-1===e.indexOf("."))a[e]=t.refs[e].value;else if(t.refs[e].checked){var l=e.split(".")[0],n=e.split(".")[1];a[l].push(n)}}),x.export.triggerPromise(a).then(function(e){i.default.success("Successfully export content pack. Starting download...","Success!"),u.default.save(e,"content_pack.json","application/json","utf-8")})},isEmpty:function(e){return void 0===e||("function"==typeof e.count?0===e.count():0===e.length)},inputDetails:function(e){var t=e.name;return e.attributes.bind_address&&(t+=" on "+e.attributes.bind_address,e.attributes.port&&(t+=" port "+e.attributes.port)),t},formatDashboard:function(e){return n.default.createElement("div",{className:"checkbox",key:"dashboard_checkbox-"+e.id},n.default.createElement("label",{className:"checkbox"},n.default.createElement("input",{ref:"dashboards."+e.id,type:"checkbox",name:"dashboards",id:"dashboard_"+e.id,value:e.id}),e.title))},formatGrokPattern:function(e){return n.default.createElement("div",{className:"checkbox",key:"grok_pattern_checkbox-"+e.id},n.default.createElement("label",{className:"checkbox"},n.default.createElement("input",{ref:"grok_patterns."+e.id,type:"checkbox",name:"grokPatterns",id:"grokPattern_"+e.id,value:e.id}),e.name),n.default.createElement("span",{className:"help-inline"},"Pattern: ",n.default.createElement("tt",null,e.pattern)))},formatInput:function(e){return n.default.createElement("div",{className:"checkbox",key:"input_checkbox-"+e.id},n.default.createElement("label",{className:"checkbox"},n.default.createElement("input",{ref:"inputs."+e.id,type:"checkbox",name:"inputs",id:"input_"+e.id,value:e.id}),e.title),n.default.createElement("span",{className:"help-inline"},"(",this.inputDetails(e),")"))},formatOutput:function(e){return n.default.createElement("div",{className:"checkbox",key:"output_checkbox-"+e.id},n.default.createElement("label",{className:"checkbox"},n.default.createElement("input",{ref:"outputs."+e.id,type:"checkbox",name:"outputs",id:"output_"+e.id,value:e.id}),e.title))},formatStream:function(e){return n.default.createElement("div",{className:"checkbox",key:"stream_checkbox-"+e.id},n.default.createElement("label",{className:"checkbox"},n.default.createElement("input",{ref:"streams."+e.id,type:"checkbox",name:"streams",id:"stream_"+e.id,value:e.id}),e.title))},selectAll:function(e){var t=this;Object.keys(this.refs).forEach(function(a){0===a.indexOf(e)&&(t.refs[a].checked=!0)})},selectAllInputs:function(){this.selectAll("input")},selectAllGrokPatterns:function(){this.selectAll("grok_pattern")},selectAllOutputs:function(){this.selectAll("output")},selectAllStreams:function(){this.selectAll("stream")},selectAllDashboards:function(){this.selectAll("dashboard")},render:function(){return n.default.createElement(b.DocumentTitle,{title:"Create a content pack"},n.default.createElement("span",null,n.default.createElement(b.PageHeader,{title:"Create a content pack"},n.default.createElement("span",null,"Export your inputs, outputs, streams and dashboards as a content pack and share it with the community or other setups.")),n.default.createElement(o.Row,{className:"content"},n.default.createElement(o.Col,{md:6},n.default.createElement("form",{className:"form-horizontal build-content-pack",onSubmit:this.onSubmit},n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{sm:2},n.default.createElement("label",{className:"control-label",htmlFor:"name"},"Name")),n.default.createElement(o.Col,{sm:10},n.default.createElement("input",{ref:"name",type:"text",id:"name",className:"input-xlarge form-control",name:"name",required:!0}),n.default.createElement("span",{className:"help-block"},"The name of your configuration bundle."))),n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{sm:2},n.default.createElement("label",{className:"control-label",htmlFor:"description"},"Description")),n.default.createElement(o.Col,{sm:10},n.default.createElement("textarea",{ref:"description",rows:"6",id:"description",name:"description",className:"input-xlarge form-control",required:!0}),n.default.createElement("span",{className:"help-block"},"A description of what your bundle does and possible special instructions for the user. You can use ",n.default.createElement("a",{href:"http://daringfireball.net/projects/markdown/syntax",target:"_blank"},"Markdown")," syntax."))),n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{sm:2},n.default.createElement("label",{className:"control-label",htmlFor:"category"},"Category")),n.default.createElement(o.Col,{sm:10},n.default.createElement("input",{ref:"category",type:"text",id:"category",name:"category",className:"input-xlarge form-control",required:!0}),n.default.createElement("span",{className:"help-block"},"A category for your bundle, e.g. Operating Systems, Firewalls or Switches."))),n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{sm:2},n.default.createElement("label",{className:"control-label",htmlFor:"inputs"},"Inputs")),n.default.createElement(o.Col,{sm:10},this.isEmpty(this.state.inputs)?n.default.createElement("span",{className:"help-block help-standalone"},"There are no inputs to export."):n.default.createElement("span",null,n.default.createElement(o.Button,{className:"btn btn-sm btn-link select-all",onClick:this.selectAllInputs},"Select all"),this.state.inputs.sort(function(e,t){return e.title.localeCompare(t.title)}).map(this.formatInput)))),n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{sm:2},n.default.createElement("label",{className:"control-label",htmlFor:"grokPatterns"},"Grok Patterns")),n.default.createElement(o.Col,{sm:10},this.isEmpty(this.state.grok_patterns)?n.default.createElement("span",{className:"help-block help-standalone"},"There are no grok patterns to export."):n.default.createElement("span",null,n.default.createElement(o.Button,{className:"btn btn-sm btn-link select-all",onClick:this.selectAllGrokPatterns},"Select all"),this.state.grok_patterns.sort(function(e,t){return e.name.localeCompare(t.name)}).map(this.formatGrokPattern)))),n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{sm:2},n.default.createElement("label",{className:"control-label",htmlFor:"outputs"},"Outputs")),n.default.createElement(o.Col,{sm:10},this.isEmpty(this.state.outputs)?n.default.createElement("span",{className:"help-block help-standalone"},"There are no outputs to export."):n.default.createElement("span",null,n.default.createElement(o.Button,{className:"btn btn-sm btn-link select-all",onClick:this.selectAllOutputs},"Select all"),this.state.outputs.sort(function(e,t){return e.title.localeCompare(t.title)}).map(this.formatOutput)))),n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{sm:2},n.default.createElement("label",{className:"control-label",htmlFor:"streams"},"Streams")),n.default.createElement(o.Col,{sm:10},this.isEmpty(this.state.streams)?n.default.createElement("span",{className:"help-block help-standalone"},"There are no streams to export."):n.default.createElement("span",null,n.default.createElement(o.Button,{className:"btn btn-sm btn-link select-all",onClick:this.selectAllStreams},"Select all"),this.state.streams.sort(function(e,t){return e.title.localeCompare(t.title)}).map(this.formatStream)))),n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{sm:2},n.default.createElement("label",{className:"control-label",htmlFor:"dashboards"},"Dashboards")),n.default.createElement(o.Col,{sm:10},this.isEmpty(this.state.dashboards)?n.default.createElement("span",{className:"help-block help-standalone"},"There are no dashboards to export."):n.default.createElement("span",null,n.default.createElement(o.Button,{className:"btn btn-sm btn-link select-all",onClick:this.selectAllDashboards},"Select all"),this.state.dashboards.sort(function(e,t){return e.title.localeCompare(t.title)}).map(this.formatDashboard)))),n.default.createElement("div",{className:"form-group"},n.default.createElement(o.Col,{smOffset:2,sm:10},n.default.createElement(o.Button,{bsStyle:"success",type:"submit"},n.default.createElement("i",{className:"fa fa-cloud-download"})," Download my content pack"),n.default.createElement("br",null),n.default.createElement("br",null),n.default.createElement("p",null,n.default.createElement("i",{className:"fa fa-lightbulb-o"}),"  Share your content pack with the community on the ",n.default.createElement("a",{href:"https://marketplace.graylog.org/",target:"_blank"},"Graylog Marketplace")," after you have downloaded it."))))))))}});exports.default=C,e.exports=exports.default}});
//# sourceMappingURL=44.f4e666cd5ae6a3e3cac4.js.map
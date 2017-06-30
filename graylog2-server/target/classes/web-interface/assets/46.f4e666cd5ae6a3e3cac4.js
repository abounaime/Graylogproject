webpackJsonp([46],{1198:function(e,exports,t){"use strict";function a(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var r=t(2),n=a(r),l=t(1),o=a(l),u=t(15),i=t(49),s=t(48),c=t(1055),d=a(c),p=t(7),f=a(p),m=t(18),x=a(m),E=f.default.getActions("Extractors"),g=x.default.getStore("Extractors"),h=n.default.createClass({displayName:"ExportExtractors",propTypes:{input:r.PropTypes.object.isRequired},mixins:[o.default.connect(g),o.default.ListenerMethods],componentDidMount:function(){E.list.triggerPromise(this.props.input.id)},_isLoading:function(){return!this.state.extractors},render:function(){if(this._isLoading())return n.default.createElement(s.Spinner,null);var e={extractors:this.state.extractors.map(function(e){var t={};return Object.keys(e).forEach(function(a){switch(a){case"type":t.extractor_type=e[a];break;case"id":case"metrics":case"creator_user_id":case"exceptions":case"converter_exceptions":break;default:t[a]=e[a]}}),t}),version:d.default.getFullVersion()},t=JSON.stringify(e,null,2);return n.default.createElement(u.Row,{className:"content"},n.default.createElement(u.Col,{md:12},n.default.createElement(u.Row,null,n.default.createElement(u.Col,{md:8},n.default.createElement("h2",null,"Extractors JSON")),n.default.createElement(u.Col,{md:4},n.default.createElement(s.ClipboardButton,{title:"Copy extractors",className:"pull-right",target:"#extractor-export-textarea"}))),n.default.createElement(u.Row,null,n.default.createElement(u.Col,{md:12},n.default.createElement(i.Input,{type:"textarea",id:"extractor-export-textarea",rows:30,defaultValue:t})))))}});exports.default=h,e.exports=exports.default},1347:function(e,exports,t){"use strict";function a(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var r=t(2),n=a(r),l=t(1),o=a(l),u=t(48),i=t(1198),s=a(i),c=t(7),d=a(c),p=t(18),f=a(p),m=d.default.getActions("Inputs"),x=f.default.getStore("Inputs"),E=n.default.createClass({displayName:"ExportExtractorsPage",propTypes:{params:r.PropTypes.object.isRequired},mixins:[o.default.connect(x)],getInitialState:function(){return{input:void 0}},componentDidMount:function(){m.get.triggerPromise(this.props.params.inputId)},_isLoading:function(){return!this.state.input},render:function(){return this._isLoading()?n.default.createElement(u.Spinner,null):n.default.createElement(u.DocumentTitle,{title:"Export extractors of "+this.state.input.title},n.default.createElement("div",null,n.default.createElement(u.PageHeader,{title:n.default.createElement("span",null,"Export extractors of ",n.default.createElement("em",null,this.state.input.title))},n.default.createElement("span",null,"The extractors of an input can be exported to JSON for importing into other setups or sharing in ",n.default.createElement("a",{href:"https://marketplace.graylog.org/",target:"_blank"},"the Graylog Marketplace"),".")),n.default.createElement(s.default,{input:this.state.input})))}});exports.default=E,e.exports=exports.default}});
//# sourceMappingURL=46.f4e666cd5ae6a3e3cac4.js.map
webpackJsonp([21],{1017:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(968),s=n(r),l=t(15),u=t(49),o=t(263),p=n(o),d=i.default.createClass({displayName:"InputDropdown",propTypes:{inputs:a.PropTypes.object,title:a.PropTypes.string,preselectedInputId:a.PropTypes.string,onLoadMessage:a.PropTypes.func,disabled:a.PropTypes.bool},mixins:[s.default],getInitialState:function(){return{selectedInput:this.props.preselectedInputId||this.PLACEHOLDER}},PLACEHOLDER:"placeholder",_formatInput:function(e){return i.default.createElement("option",{key:e.id,value:e.id},e.title," (",e.type,")")},_sortByTitle:function(e,t){return e.title.localeCompare(t.title)},_onLoadMessage:function(){this.props.onLoadMessage(this.state.selectedInput)},_formatStaticInput:function(e){return i.default.createElement(u.Input,{type:"select",style:{float:"left",width:400,marginRight:10},disabled:!0},i.default.createElement("option",null,e.title+" ("+e.type+")"))},render:function(){if(this.props.inputs&&this.props.preselectedInputId)return i.default.createElement("div",null,this._formatStaticInput(this.props.inputs.get(this.props.preselectedInputId)),i.default.createElement(l.Button,{bsStyle:"info",disabled:this.state.selectedInput===this.PLACEHOLDER,onClick:this._onLoadMessage},this.props.title));if(this.props.inputs){var e=this.props.inputs.sort(this._sortByTitle).map(this._formatInput);return i.default.createElement("div",null,i.default.createElement(u.Input,{type:"select",style:{float:"left",width:400,marginRight:10},valueLink:this.linkState("selectedInput"),placeholder:this.PLACEHOLDER},i.default.createElement("option",{value:this.PLACEHOLDER},"Select an input"),e.toArray()),i.default.createElement(l.Button,{bsStyle:"info",disabled:this.props.disabled||this.state.selectedInput===this.PLACEHOLDER,onClick:this._onLoadMessage},this.props.title))}return i.default.createElement(p.default,null)}});exports.default=d,e.exports=exports.default},1047:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(1),s=n(r),l=t(15),u=t(48),o=t(7),p=n(o),d=t(18),c=n(d),f=t(982),m=p.default.getActions("InputTypes"),h=p.default.getActions("Inputs"),g=c.default.getStore("InputTypes"),_=i.default.createClass({displayName:"CreateInputControl",mixins:[s.default.connect(g)],getInitialState:function(){return{selectedInput:void 0,selectedInputDefinition:void 0}},_formatSelectOptions:function(){var e=this,t=[];if(this.state.inputTypes){t=Object.keys(this.state.inputTypes).map(function(t){return{value:t,label:e.state.inputTypes[t]}}),t.sort(function(e,t){return e.label.toLowerCase().localeCompare(t.label.toLowerCase())})}else t.push({value:"none",label:"No inputs available",disabled:!0});return t},_onInputSelect:function(e){var t=this;""===e&&this.setState(this.getInitialState()),this.setState({selectedInput:e}),m.get.triggerPromise(e).then(function(e){return t.setState({selectedInputDefinition:e})})},_openModal:function(e){e.preventDefault(),this.refs.configurationForm.open()},_createInput:function(e){var t=this;h.create(e).then(function(){t.setState(t.getInitialState())})},render:function(){var e=void 0;if(this.state.selectedInputDefinition){var t=this.state.inputTypes[this.state.selectedInput];e=i.default.createElement(f.InputForm,{ref:"configurationForm",key:"configuration-form-input",configFields:this.state.selectedInputDefinition.requested_configuration,title:i.default.createElement("span",null,"Launch new ",i.default.createElement("em",null,t)," input"),helpBlock:"Select a name of your new input that describes it.",typeName:this.state.selectedInput,submitAction:this._createInput})}return i.default.createElement(l.Row,{className:"content input-new"},i.default.createElement(l.Col,{md:12},i.default.createElement("form",{className:"form-inline",onSubmit:this._openModal},i.default.createElement("div",{className:"form-group",style:{width:300}},i.default.createElement(u.Select,{placeholder:"Select input",options:this._formatSelectOptions(),matchProp:"label",onValueChange:this._onInputSelect,value:this.state.selectedInput}))," ",i.default.createElement(l.Button,{bsStyle:"success",type:"submit",disabled:!this.state.selectedInput},"Launch new input"),i.default.createElement(l.Button,{href:"https://marketplace.graylog.org/",target:"_blank",bsStyle:"info",style:{marginLeft:10}},i.default.createElement("i",{className:"fa fa-external-link"})," Find more inputs")),e))}});exports.default=_,e.exports=exports.default},1048:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(1),s=n(r),l=t(15),u=t(958),o=t(48),p=t(962),d=t(168),c=n(d),f=t(75),m=n(f),h=t(18),g=n(h),_=t(7),y=n(_),b=t(982),E=g.default.getStore("InputTypes"),v=y.default.getActions("Inputs"),I=i.default.createClass({displayName:"InputListItem",propTypes:{input:a.PropTypes.object.isRequired,currentNode:a.PropTypes.object.isRequired,permissions:a.PropTypes.array.isRequired},mixins:[c.default,s.default.connect(E)],_deleteInput:function(){window.confirm("Do you really want to delete input '"+this.props.input.title+"'?")&&v.delete(this.props.input)},_openStaticFieldForm:function(){this.refs.staticFieldForm.open()},_editInput:function(){this.refs.configurationForm.open()},_updateInput:function(e){v.update(this.props.input.id,e)},render:function(){if(!this.state.inputTypes)return i.default.createElement(o.Spinner,null);var e=this.props.input,t=this.state.inputDescriptions[e.type],n=i.default.createElement("span",null,this.props.input.name," ",i.default.createElement(b.InputStateBadge,{input:this.props.input})),a=[];if(this.isPermitted(this.props.permissions,["searches:relative"])&&a.push(i.default.createElement(u.LinkContainer,{key:"received-messages-"+this.props.input.id,to:m.default.search("gl2_source_input:"+this.props.input.id,{relative:0})},i.default.createElement(l.Button,{bsStyle:"info"},"Show received messages"))),this.isPermitted(this.props.permissions,["inputs:edit:"+this.props.input.id])){var r=void 0;r=this.props.input.global?m.default.global_input_extractors(this.props.input.id):m.default.local_input_extractors(this.props.currentNode.node_id,this.props.input.id),a.push(i.default.createElement(u.LinkContainer,{key:"manage-extractors-"+this.props.input.id,to:r},i.default.createElement(l.Button,{bsStyle:"info"},"Manage extractors"))),a.push(i.default.createElement(b.InputStateControl,{key:"input-state-control-"+this.props.input.id,input:this.props.input}))}var s=void 0;this.props.input.global||(s=i.default.createElement(u.LinkContainer,{to:m.default.filtered_metrics(this.props.input.node,this.props.input.id)},i.default.createElement(l.MenuItem,{key:"show-metrics-"+this.props.input.id},"Show metrics"))),a.push(i.default.createElement(l.DropdownButton,{key:"more-actions-"+this.props.input.id,title:"More actions",id:"more-actions-dropdown-"+this.props.input.id,pullRight:!0},i.default.createElement(o.IfPermitted,{permissions:"inputs:edit:"+this.props.input.id},i.default.createElement(l.MenuItem,{key:"edit-input-"+this.props.input.id,onSelect:this._editInput,disabled:void 0===t},"Edit input")),s,i.default.createElement(o.IfPermitted,{permissions:"inputs:edit:"+this.props.input.id},i.default.createElement(l.MenuItem,{key:"add-static-field-"+this.props.input.id,onSelect:this._openStaticFieldForm},"Add static field")),i.default.createElement(o.IfPermitted,{permissions:"inputs:terminate"},i.default.createElement(l.MenuItem,{key:"divider-"+this.props.input.id,divider:!0})),i.default.createElement(o.IfPermitted,{permissions:"inputs:terminate"},i.default.createElement(l.MenuItem,{key:"delete-input-"+this.props.input.id,onSelect:this._deleteInput},"Delete input"))));var d=void 0;!this.props.input.global&&this.props.input.node&&(d=i.default.createElement("span",null,"On node"," ",i.default.createElement(o.LinkToNode,{nodeId:this.props.input.node})));var c=t?i.default.createElement(b.InputForm,{ref:"configurationForm",key:"edit-form-input-"+e.id,globalValue:e.global,nodeValue:e.node,configFields:t.requested_configuration,title:"Editing Input "+e.title,titleValue:e.title,typeName:e.type,includeTitleField:!0,submitAction:this._updateInput,values:e.attributes}):null,f=i.default.createElement("div",null,i.default.createElement(l.Col,{md:8},i.default.createElement(p.ConfigurationWell,{className:"configuration-well",id:e.id,configuration:e.attributes,typeDefinition:t||{}}),i.default.createElement(b.StaticFieldForm,{ref:"staticFieldForm",input:this.props.input}),i.default.createElement(b.InputStaticFields,{input:this.props.input})),i.default.createElement(l.Col,{md:4},i.default.createElement(b.InputThroughput,{input:e})),c);return i.default.createElement(o.EntityListItem,{key:"entry-list-"+this.props.input.id,title:this.props.input.title,titleSuffix:n,description:d,createdFromContentPack:!!this.props.input.content_pack,actions:a,contentRow:f})}});exports.default=I,e.exports=exports.default},1094:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var a in n)Object.prototype.hasOwnProperty.call(n,a)&&(e[a]=n[a])}return e},i=t(2),r=n(i),s=t(12),l=n(s),u=t(982),o=t(962),p=r.default.createClass({displayName:"InputForm",propTypes:{globalValue:r.default.PropTypes.bool,nodeValue:r.default.PropTypes.string,titleValue:r.default.PropTypes.string,submitAction:r.default.PropTypes.func.isRequired,values:r.default.PropTypes.object},getInitialState:function(){return{global:void 0!==this.props.globalValue&&this.props.globalValue,node:void 0!==this.props.nodeValue?this.props.nodeValue:void 0}},_handleChange:function(e,t){var n={};n[e]=t,this.setState(n)},_onSubmit:function(e){var t=l.default.extend(e,{global:this.state.global,node:this.state.node});this.props.submitAction(t)},open:function(){this.refs.configurationForm.open()},render:function(){var e=this.props.values?this.props.values:this.refs.configurationForm?this.refs.configurationForm.getValue().configuration:{},t=this.props.titleValue?this.props.titleValue:this.refs.configurationForm?this.refs.configurationForm.getValue().titleValue:"";return r.default.createElement(o.ConfigurationForm,a({},this.props,{ref:"configurationForm",values:e,titleValue:t,submitAction:this._onSubmit}),r.default.createElement(u.NodeOrGlobalSelect,{onChange:this._handleChange,global:this.state.global,node:this.state.node}))}});exports.default=p,e.exports=exports.default},1095:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(1),s=n(r),l=t(15),u=t(18),o=n(u),p=t(48),d=t(1136),c=n(d),f=o.default.getStore("InputStates"),m=o.default.getStore("Nodes"),h=i.default.createClass({displayName:"InputStateBadge",propTypes:{input:i.default.PropTypes.object.isRequired},mixins:[s.default.connect(f),s.default.connect(m)],comparator:new c.default,_labelClassForState:function(e){var t=e.reduce(function(e,t){return e+t.count},0);if(this.props.input.global&&t!==Object.keys(this.state.nodes).length)return"warning";switch(e[0].state){case"RUNNING":return"success";case"FAILED":return"danger";case"STARTING":return"info";default:return"warning"}},_textForState:function(e){return this.props.input.global?e.map(function(e){return e.count+" "+e.state}).join(", "):e[0].state},_isLoading:function(){return!(this.state.inputStates&&this.state.nodes)},render:function(){var e=this;if(this._isLoading())return i.default.createElement(p.Spinner,null);var t=this.props.input,n=t.id,a={};this.state.inputStates[n]&&Object.keys(this.state.inputStates[n]).forEach(function(t){var i=e.state.inputStates[n][t].state;a[i]||(a[i]=[]),a[i].push(t)});var r=Object.keys(a).sort(this.comparator.compare.bind(this.comparator)).map(function(e){return{state:e,count:a[e].length}});if(r.length>0){var s=r.map(function(e){return a[e.state].map(function(t){return i.default.createElement("span",null,i.default.createElement(p.LinkToNode,{nodeId:t}),": ",e.state,i.default.createElement("br",null))})}),u=i.default.createElement(l.Popover,{id:"inputstate-badge-details",title:"Input States for "+t.title,style:{fontSize:12}},s);return i.default.createElement(l.OverlayTrigger,{trigger:"click",placement:"bottom",overlay:u,rootClose:!0},i.default.createElement(l.Label,{bsStyle:this._labelClassForState(r),title:"Click to show details",bsSize:"xsmall",style:{cursor:"pointer"}},this._textForState(r)))}var o=t.global||void 0===t.node?"0 RUNNING":"NOT RUNNING";return i.default.createElement(l.Label,{bsStyle:"danger",bsSize:"xsmall"},o)}});exports.default=h,e.exports=exports.default},1096:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}function a(e){return e.inputStates?e.inputStates[this.props.input.id]:void 0}Object.defineProperty(exports,"__esModule",{value:!0});var i=t(2),r=n(i),s=t(1),l=n(s),u=t(15),o=t(18),p=n(o),d=p.default.getStore("InputStates"),c=r.default.createClass({displayName:"InputStateControl",propTypes:{input:i.PropTypes.object.isRequired},mixins:[l.default.connectFilter(d,"inputState",a)],getInitialState:function(){return{loading:!1}},_isInputRunning:function(){var e=this;if(!this.state.inputState)return!1;var t=Object.keys(this.state.inputState);return 0!==t.length&&t.some(function(t){return"RUNNING"===e.state.inputState[t].state})},_startInput:function(){var e=this;this.setState({loading:!0}),d.start(this.props.input).finally(function(){return e.setState({loading:!1})})},_stopInput:function(){var e=this;this.setState({loading:!0}),d.stop(this.props.input).finally(function(){return e.setState({loading:!1})})},render:function(){return this._isInputRunning()?r.default.createElement(u.Button,{bsStyle:"primary",onClick:this._stopInput,disabled:this.state.loading},this.state.loading?"Stopping...":"Stop input"):r.default.createElement(u.Button,{bsStyle:"success",onClick:this._startInput,disabled:this.state.loading},this.state.loading?"Starting...":"Start input")}});exports.default=c,e.exports=exports.default},1097:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(15),s=t(18),l=n(s),u=l.default.getStore("InputStaticFields"),o=i.default.createClass({displayName:"InputStaticFields",propTypes:{input:a.PropTypes.object.isRequired},_deleteStaticField:function(e){var t=this;return function(){window.confirm("Are you sure you want to remove static field '"+e+"' from '"+t.props.input.title+"'?")&&u.destroy(t.props.input,e)}},_deleteButton:function(e){return i.default.createElement(r.Button,{bsStyle:"link",bsSize:"xsmall",style:{verticalAlign:"baseline"},onClick:this._deleteStaticField(e)},i.default.createElement("i",{className:"fa fa-remove"}))},_formatStaticFields:function(e){var t=this,n=[];return Object.keys(e).forEach(function(a){n.push(i.default.createElement("li",{key:a+"-field"},i.default.createElement("strong",null,a,":")," ",e[a]," ",t._deleteButton(a)))}),n},render:function(){return 0===Object.keys(this.props.input.static_fields).length?i.default.createElement("div",null):i.default.createElement("div",{className:"static-fields"},i.default.createElement("h3",{style:{marginBottom:5}},"Static fields"),i.default.createElement("ul",null,this._formatStaticFields(this.props.input.static_fields)))}});exports.default=o,e.exports=exports.default},1098:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(1),s=n(r),l=t(116),u=n(l),o=t(18),p=n(o),d=t(7),c=n(d),f=t(117),m=n(f),h=t(48),g=p.default.getStore("Metrics"),_=c.default.getActions("Metrics"),y=i.default.createClass({displayName:"InputThroughput",propTypes:{input:i.default.PropTypes.object.isRequired},mixins:[s.default.connect(g)],getInitialState:function(){return{showDetails:!1}},componentWillMount:function(){this._metricNames().forEach(function(e){return _.addGlobal(e)})},componentWillUnmount:function(){this._metricNames().forEach(function(e){return _.removeGlobal(e)})},_metricNames:function(){return[this._prefix("incomingMessages"),this._prefix("emptyMessages"),this._prefix("open_connections"),this._prefix("total_connections"),this._prefix("written_bytes_1sec"),this._prefix("written_bytes_total"),this._prefix("read_bytes_1sec"),this._prefix("read_bytes_total")]},_prefix:function(e){var t=this.props.input;return t.type+"."+t.id+"."+e},_getValueFromMetric:function(e){if(null!==e&&void 0!==e)switch(e.type){case"meter":return e.metric.rate.mean;case"gauge":return e.metric.value;case"counter":return e.metric.count;default:return}},_calculateMetrics:function(e){var t=this,n={};return this._metricNames().forEach(function(a){n[a]=Object.keys(e).reduce(function(n,i){if(!e[i][a])return n;var r=t._getValueFromMetric(e[i][a]);return void 0!==r?isNaN(n)?r:n+r:n},NaN)}),n},_formatCount:function(e){return(0,u.default)(e).format("0,0")},_formatNetworkStats:function(e,t,n,a){return i.default.createElement("span",{className:"input-io"},i.default.createElement("span",null,"Network IO: "),i.default.createElement("span",{className:"persec"},i.default.createElement("i",{className:"fa fa-caret-down channel-direction channel-direction-down"}),i.default.createElement("span",{className:"rx value"},m.default.formatBytes(n)," "),i.default.createElement("i",{className:"fa fa-caret-up channel-direction channel-direction-up"}),i.default.createElement("span",{className:"tx value"},m.default.formatBytes(e))),i.default.createElement("span",{className:"total"},i.default.createElement("span",null," (total: "),i.default.createElement("i",{className:"fa fa-caret-down channel-direction channel-direction-down"}),i.default.createElement("span",{className:"rx value"},m.default.formatBytes(a)," "),i.default.createElement("i",{className:"fa fa-caret-up channel-direction channel-direction-up"}),i.default.createElement("span",{className:"tx value"},m.default.formatBytes(t)),i.default.createElement("span",null," )")),i.default.createElement("br",null))},_formatConnections:function(e,t){return i.default.createElement("span",null,"Active connections: ",i.default.createElement("span",{className:"active"},this._formatCount(e)," "),"(",i.default.createElement("span",{className:"total"},this._formatCount(t))," total)",i.default.createElement("br",null))},_formatAllNodeDetails:function(e){var t=this;return i.default.createElement("span",null,i.default.createElement("hr",{key:"separator"}),Object.keys(e).map(function(n){return t._formatNodeDetails(n,e[n])}))},_formatNodeDetails:function(e,t){var n=this._getValueFromMetric(t[this._prefix("open_connections")]),a=this._getValueFromMetric(t[this._prefix("total_connections")]),r=this._getValueFromMetric(t[this._prefix("emptyMessages")]),s=this._getValueFromMetric(t[this._prefix("written_bytes_1sec")]),l=this._getValueFromMetric(t[this._prefix("written_bytes_total")]),u=this._getValueFromMetric(t[this._prefix("read_bytes_1sec")]),o=this._getValueFromMetric(t[this._prefix("read_bytes_total")]);return i.default.createElement("span",{key:this.props.input.id+e},i.default.createElement(h.LinkToNode,{nodeId:e}),i.default.createElement("br",null),!isNaN(s)&&this._formatNetworkStats(s,l,u,o),!isNaN(n)&&this._formatConnections(n,a),!isNaN(r)&&i.default.createElement("span",null,"Empty messages discarded: ",this._formatCount(r),i.default.createElement("br",null)),isNaN(s)&&isNaN(n)&&i.default.createElement("span",null,"No metrics available for this node"),i.default.createElement("br",null))},_toggleShowDetails:function(e){e.preventDefault(),this.setState({showDetails:!this.state.showDetails})},render:function(){if(!this.state.metrics)return i.default.createElement(h.Spinner,null);var e=this._calculateMetrics(this.state.metrics),t=e[this._prefix("incomingMessages")],n=e[this._prefix("emptyMessages")],a=e[this._prefix("open_connections")],r=e[this._prefix("total_connections")],s=e[this._prefix("written_bytes_1sec")],l=e[this._prefix("written_bytes_total")],u=e[this._prefix("read_bytes_1sec")],o=e[this._prefix("read_bytes_total")];return i.default.createElement("div",{className:"graylog-input-metrics"},i.default.createElement("h3",null,"Throughput / Metrics"),i.default.createElement("span",null,isNaN(t)&&isNaN(s)&&isNaN(a)&&i.default.createElement("i",null,"No metrics available for this input"),!isNaN(t)&&i.default.createElement("span",null,"1 minute average rate: ",this._formatCount(t)," msg/s",i.default.createElement("br",null)),!isNaN(s)&&this._formatNetworkStats(s,l,u,o),!isNaN(a)&&this._formatConnections(a,r),!isNaN(n)&&i.default.createElement("span",null,"Empty messages discarded: ",this._formatCount(n),i.default.createElement("br",null)),!isNaN(s)&&this.props.input.global&&i.default.createElement("a",{href:"",onClick:this._toggleShowDetails},this.state.showDetails?"Hide":"Show"," details"),!isNaN(s)&&this.state.showDetails&&this._formatAllNodeDetails(this.state.metrics)))}});exports.default=y,e.exports=exports.default},1099:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(1),s=n(r),l=t(15),u=t(960),o=n(u),p=t(273),d=n(p),c=t(1048),f=n(c),m=t(48),h=t(1047),g=n(h),_=t(7),y=n(_),b=t(18),E=n(b),v=y.default.getActions("Inputs"),I=y.default.getActions("SingleNode"),S=y.default.getActions("InputTypes"),N=E.default.getStore("Inputs"),C=E.default.getStore("SingleNode"),T=i.default.createClass({displayName:"InputsList",propTypes:{permissions:a.PropTypes.array.isRequired,node:a.PropTypes.object},mixins:[s.default.connect(C),s.default.listenTo(N,"_splitInputs")],getInitialState:function(){return{globalInputs:void 0,localInputs:void 0}},componentDidMount:function(){S.list(),v.list(),I.get()},_splitInputs:function(e){var t=this,n=e.inputs,a=n.filter(function(e){return!0===e.global}).sort(function(e,t){return(0,o.default)(e.title,t.title)}),i=n.filter(function(e){return!1===e.global}).sort(function(e,t){return(0,o.default)(e.title,t.title)});this.props.node&&(i=i.filter(function(e){return e.node===t.props.node.node_id})),this.setState({globalInputs:a,localInputs:i})},_isLoading:function(){return!(this.state.localInputs&&this.state.globalInputs&&this.state.node)},_formatInput:function(e){return i.default.createElement(f.default,{key:e.id,input:e,currentNode:this.state.node,permissions:this.props.permissions})},_nodeAffix:function(){return this.props.node?" on this node":""},render:function(){var e=this;return this._isLoading()?i.default.createElement(m.Spinner,null):i.default.createElement("div",null,!this.props.node&&i.default.createElement(m.IfPermitted,{permissions:"inputs:create"},i.default.createElement(g.default,null)),i.default.createElement(l.Row,{id:"global-inputs",className:"content input-list"},i.default.createElement(l.Col,{md:12},i.default.createElement("h2",null,"Global inputs  ",i.default.createElement("small",null,this.state.globalInputs.length," configured",this._nodeAffix())),i.default.createElement(d.default,{bsNoItemsStyle:"info",noItemsText:"There are no global inputs.",items:this.state.globalInputs.map(function(t){return e._formatInput(t)})}))),i.default.createElement(l.Row,{id:"local-inputs",className:"content input-list"},i.default.createElement(l.Col,{md:12},i.default.createElement("h2",null,"Local inputs  ",i.default.createElement("small",null,this.state.localInputs.length," configured",this._nodeAffix())),i.default.createElement(d.default,{bsNoItemsStyle:"info",noItemsText:"There are no local inputs"+this._nodeAffix()+".",items:this.state.localInputs.map(function(t){return e._formatInput(t)})}))))}});exports.default=T,e.exports=exports.default},1100:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(1),s=n(r),l=t(49),u=t(18),o=n(u),p=t(48),d=o.default.getStore("Nodes"),c=i.default.createClass({displayName:"NodeOrGlobalSelect",propTypes:{global:i.default.PropTypes.bool,onChange:i.default.PropTypes.func.isRequired,node:i.default.PropTypes.string},mixins:[s.default.connect(d)],getInitialState:function(){return{global:void 0!==this.props.global&&this.props.global,node:this.props.node}},_onChangeGlobal:function(e){var t=e.target.checked;this.setState({global:t}),t?(this.setState({node:"placeholder"}),this.props.onChange("node",void 0)):this.props.onChange("node",this.state.node),this.props.onChange("global",t)},_onChangeNode:function(e){this.setState({node:e.target.value}),this.props.onChange("node",e.target.value)},render:function(){var e=this;if(!this.state.nodes)return i.default.createElement(p.Spinner,null);var t=Object.keys(this.state.nodes).map(function(t){return i.default.createElement("option",{key:t,value:t},e.state.nodes[t].short_node_id," / ",e.state.nodes[t].hostname)}),n=this.state.global?null:i.default.createElement(l.Input,{type:"select",label:"Node",placeholder:"placeholder",value:this.state.node,help:"On which node should this input start",onChange:this._onChangeNode,required:!0},i.default.createElement("option",{key:"placeholder",value:""},"Select Node"),t);return i.default.createElement("span",null,i.default.createElement(l.Input,{type:"checkbox",label:"Global",help:"Should this input start on all nodes",checked:this.state.global,onChange:this._onChangeGlobal}),n)}});exports.default=c,e.exports=exports.default},1101:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(49),s=t(18),l=n(s),u=l.default.getStore("InputStaticFields"),o=i.default.createClass({displayName:"StaticFieldForm",propTypes:{input:a.PropTypes.object.isRequired},open:function(){this.refs.modal.open()},_addStaticField:function(){var e=this,t=this.refs.fieldName.getValue(),n=this.refs.fieldValue.getValue();u.create(this.props.input,t,n).then(function(){return e.refs.modal.close()})},render:function(){return i.default.createElement(r.BootstrapModalForm,{ref:"modal",title:"Add static field",submitButtonText:"Add field",onSubmitForm:this._addStaticField},i.default.createElement("p",null,"Define a static field that is added to every message that comes in via this input. The field is not overwritten If the message already has that key. Key must only contain alphanumeric characters or underscores and not be a reserved field."),i.default.createElement(r.Input,{ref:"fieldName",type:"text",id:"field-name",label:"Field name",className:"validatable","data-validate":"alphanum_underscore",required:!0,autoFocus:!0}),i.default.createElement(r.Input,{ref:"fieldValue",type:"text",id:"field-value",label:"Field value",required:!0}))}});exports.default=o,e.exports=exports.default},1136:function(e,exports,t){"use strict";function n(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}Object.defineProperty(exports,"__esModule",{value:!0});var a=function(){function e(e,t){for(var n=0;n<t.length;n++){var a=t[n];a.enumerable=a.enumerable||!1,a.configurable=!0,"value"in a&&(a.writable=!0),Object.defineProperty(e,a.key,a)}}return function(t,n,a){return n&&e(t.prototype,n),a&&e(t,a),t}}(),i=function(){function e(){n(this,e),this.mapping={CREATED:0,INITIALIZED:1,INVALID_CONFIGURATION:2,STARTING:3,RUNNING:4,FAILED:2,STOPPING:1,STOPPED:0,TERMINATED:0}}return a(e,[{key:"compare",value:function(e,t){return this.mapping[e.toUpperCase()]-this.mapping[t.toUpperCase()]}}]),e}();exports.default=i,e.exports=exports.default},1358:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(2),i=n(a),r=t(1),s=n(r),l=t(18),u=n(l),o=t(48),p=t(982),d=u.default.getStore("CurrentUser"),c=u.default.getStore("InputStates"),f=i.default.createClass({displayName:"InputsPage",mixins:[s.default.connect(d)],componentDidMount:function(){this.interval=setInterval(c.list,2e3)},componentWillUnmount:function(){clearInterval(this.interval)},render:function(){return i.default.createElement(o.DocumentTitle,{title:"Inputs"},i.default.createElement("div",null,i.default.createElement(o.PageHeader,{title:"Inputs"},i.default.createElement("span",null,"Graylog nodes accept data via inputs. Launch or terminate as many inputs as you want here.")),i.default.createElement(p.InputsList,{permissions:this.state.currentUser.permissions})))}});exports.default=f,e.exports=exports.default},968:function(e,exports,t){e.exports=t(10)(336)},982:function(e,exports,t){"use strict";function n(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(exports,"__esModule",{value:!0});var a=t(1047);Object.defineProperty(exports,"CreateInputControl",{enumerable:!0,get:function(){return n(a).default}});var i=t(1017);Object.defineProperty(exports,"InputDropdown",{enumerable:!0,get:function(){return n(i).default}});var r=t(1094);Object.defineProperty(exports,"InputForm",{enumerable:!0,get:function(){return n(r).default}});var s=t(1048);Object.defineProperty(exports,"InputListItem",{enumerable:!0,get:function(){return n(s).default}});var l=t(1099);Object.defineProperty(exports,"InputsList",{enumerable:!0,get:function(){return n(l).default}});var u=t(1095);Object.defineProperty(exports,"InputStateBadge",{enumerable:!0,get:function(){return n(u).default}});var o=t(1096);Object.defineProperty(exports,"InputStateControl",{enumerable:!0,get:function(){return n(o).default}});var p=t(1098);Object.defineProperty(exports,"InputThroughput",{enumerable:!0,get:function(){return n(p).default}});var d=t(1097);Object.defineProperty(exports,"InputStaticFields",{enumerable:!0,get:function(){return n(d).default}});var c=t(1100);Object.defineProperty(exports,"NodeOrGlobalSelect",{enumerable:!0,get:function(){return n(c).default}});var f=t(1101);Object.defineProperty(exports,"StaticFieldForm",{enumerable:!0,get:function(){return n(f).default}})}});
//# sourceMappingURL=21.f4e666cd5ae6a3e3cac4.js.map
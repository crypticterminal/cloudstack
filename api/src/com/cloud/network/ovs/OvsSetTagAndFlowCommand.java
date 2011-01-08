package com.cloud.network.ovs;

import com.cloud.agent.api.Command;

public class OvsSetTagAndFlowCommand extends Command {
	String vlans;
	String vmName;
	String seqno;
	String tag;
	Long vmId;
	
	@Override
	public boolean executeInSequence() {
		return true;
	}
	
	public String getSeqNo() {
		return seqno;
	}
	
	public String getVlans() {
		return vlans;
	}
	
	public String getVmName() {
		return vmName;
	}
	
	public Long getVmId() {
		return vmId;
	}
	
	public String getTag() {
		return tag;
	}
	
	public OvsSetTagAndFlowCommand(String vmName, String tag, String vlans, String seqno, Long vmId) {
		this.vmName = vmName;
		this.tag = tag;
		this.vlans = vlans;
		this.seqno = seqno;
		this.vmId = vmId;
	}
}

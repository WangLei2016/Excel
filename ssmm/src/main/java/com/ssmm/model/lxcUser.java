package com.ssmm.model;

import java.util.Date;

public class lxcUser {
    @Override
	public String toString() {
		return "lxcUser [id=" + id + ", xxtuserid=" + xxtuserid + ", role="
				+ role + ", phonenumber=" + phonenumber + ", username="
				+ username + ", password=" + password + ", smspwd=" + smspwd
				+ ", sex=" + sex + ", exp=" + exp + ", level=" + level
				+ ", birthday=" + birthday + ", honor=" + honor
				+ ", friendcheckflag=" + friendcheckflag + ", phonesearchflag="
				+ phonesearchflag + ", teacherphoneshowflag="
				+ teacherphoneshowflag + ", signature=" + signature
				+ ", avatarurl=" + avatarurl + ", avatargroup=" + avatargroup
				+ ", avatarremote=" + avatarremote + ", thumb=" + thumb
				+ ", thumbgroup=" + thumbgroup + ", thumbremote=" + thumbremote
				+ ", forumbackgroundurl=" + forumbackgroundurl
				+ ", forumbackgroundgroup=" + forumbackgroundgroup
				+ ", forumbackgroundremote=" + forumbackgroundremote
				+ ", expiretime=" + expiretime + ", isshow=" + isshow
				+ ", issilent=" + issilent + ", deleteflag=" + deleteflag
				+ ", lastupdate=" + lastupdate + ", userStatus=" + userStatus
				+ ", province=" + province + ", ismaster=" + ismaster
				+ ", activetime=" + activetime + "]";
	}

	private Long id;

    private String xxtuserid;

    private Byte role;

    private String phonenumber;

    private String username;

    private String password;

    private String smspwd;

    private Byte sex;

    private Integer exp;

    private Short level;

    private String birthday;

    private String honor;

    private Byte friendcheckflag;

    private Byte phonesearchflag;

    private Byte teacherphoneshowflag;

    private String signature;

    private String avatarurl;

    private String avatargroup;

    private String avatarremote;

    private String thumb;

    private String thumbgroup;

    private String thumbremote;

    private String forumbackgroundurl;

    private String forumbackgroundgroup;

    private String forumbackgroundremote;

    private Date expiretime;

    private Byte isshow;

    private Boolean issilent;

    private Byte deleteflag;

    private Date lastupdate;

    private Integer userStatus;

    private String province;

    private Byte ismaster;

    private String activetime;
    

	public String getActivetime() {
		return activetime;
	}

	public void setActivetime(String activetime) {
		this.activetime = activetime;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXxtuserid() {
        return xxtuserid;
    }

    public void setXxtuserid(String xxtuserid) {
        this.xxtuserid = xxtuserid == null ? null : xxtuserid.trim();
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSmspwd() {
        return smspwd;
    }

    public void setSmspwd(String smspwd) {
        this.smspwd = smspwd == null ? null : smspwd.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor == null ? null : honor.trim();
    }

    public Byte getFriendcheckflag() {
        return friendcheckflag;
    }

    public void setFriendcheckflag(Byte friendcheckflag) {
        this.friendcheckflag = friendcheckflag;
    }

    public Byte getPhonesearchflag() {
        return phonesearchflag;
    }

    public void setPhonesearchflag(Byte phonesearchflag) {
        this.phonesearchflag = phonesearchflag;
    }

    public Byte getTeacherphoneshowflag() {
        return teacherphoneshowflag;
    }

    public void setTeacherphoneshowflag(Byte teacherphoneshowflag) {
        this.teacherphoneshowflag = teacherphoneshowflag;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }

    public String getAvatargroup() {
        return avatargroup;
    }

    public void setAvatargroup(String avatargroup) {
        this.avatargroup = avatargroup == null ? null : avatargroup.trim();
    }

    public String getAvatarremote() {
        return avatarremote;
    }

    public void setAvatarremote(String avatarremote) {
        this.avatarremote = avatarremote == null ? null : avatarremote.trim();
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    public String getThumbgroup() {
        return thumbgroup;
    }

    public void setThumbgroup(String thumbgroup) {
        this.thumbgroup = thumbgroup == null ? null : thumbgroup.trim();
    }

    public String getThumbremote() {
        return thumbremote;
    }

    public void setThumbremote(String thumbremote) {
        this.thumbremote = thumbremote == null ? null : thumbremote.trim();
    }

    public String getForumbackgroundurl() {
        return forumbackgroundurl;
    }

    public void setForumbackgroundurl(String forumbackgroundurl) {
        this.forumbackgroundurl = forumbackgroundurl == null ? null : forumbackgroundurl.trim();
    }

    public String getForumbackgroundgroup() {
        return forumbackgroundgroup;
    }

    public void setForumbackgroundgroup(String forumbackgroundgroup) {
        this.forumbackgroundgroup = forumbackgroundgroup == null ? null : forumbackgroundgroup.trim();
    }

    public String getForumbackgroundremote() {
        return forumbackgroundremote;
    }

    public void setForumbackgroundremote(String forumbackgroundremote) {
        this.forumbackgroundremote = forumbackgroundremote == null ? null : forumbackgroundremote.trim();
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    public Boolean getIssilent() {
        return issilent;
    }

    public void setIssilent(Boolean issilent) {
        this.issilent = issilent;
    }

    public Byte getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Byte deleteflag) {
        this.deleteflag = deleteflag;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Byte getIsmaster() {
        return ismaster;
    }

    public void setIsmaster(Byte ismaster) {
        this.ismaster = ismaster;
    }
}